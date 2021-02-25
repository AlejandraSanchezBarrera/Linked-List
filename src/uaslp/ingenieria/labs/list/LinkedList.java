package uaslp.ingenieria.labs.list;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    /**
     * insert date at the end of the list
     * @param data data to be inserted
     */

    public void add(int data) {
        Node node = new Node(data);

        node.setPrevious(tail);

        if(tail!=null)  {
            tail.setNext(node);
        }

        if(head==null)  {
            head=node;
        }

        tail=node;
        size++;
    }

    /**
     * @param index 0-1index
     * @return
     */

    public int get(int index) {
        Node currentNode=head;
        int currentIndex=0;

        while(currentIndex < index){
            currentNode=currentNode.getNext();
            currentIndex++;
        }
        return currentNode.getDato();
    }

    public void delete(int index){
        Node currentNode=head;
        int currentIndex=0;

        if(index<0 || index>=size){
            return;
        }

        size--;

        if(size==0){
            head=null;
            tail=null;
            return;
        }

        if(index==0){
            head=head.getNext();
            head.setPrevious(null);
        }

        if(index==size){
            tail=tail.getPrevious();
            tail.setNext(null);
        }

        if (index>0 && index<size){
            while(currentIndex<index){
                currentNode=currentNode.getNext();
                currentIndex++;
            }
            currentNode.getPrevious().setNext(currentNode.getNext());
            currentNode.getNext().setPrevious(currentNode.getPrevious());
        }
    }

    //iterador

    public int getSize(){
        return size;
    }
}




