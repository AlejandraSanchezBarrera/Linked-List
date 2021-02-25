package uaslp.ingenieria.labs.list;

class Node {
    private int data;
    private Node next;
    private Node previous;

    Node(int data){
        this.data=data;
    }

    public int getDato() {
        return data;
    }

    public void setDato(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
