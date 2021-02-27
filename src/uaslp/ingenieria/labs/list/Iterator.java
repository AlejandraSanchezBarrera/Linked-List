package uaslp.ingenieria.labs.list;

public class Iterator {
    private Node currentNode;

    public Iterator(Node currentNode) {
        this.currentNode = currentNode;
    }

    public Iterator(Iterator iterator){ //se crea un iterador basado en uno ya existente
        currentNode= iterator.currentNode;
    }

    public boolean hasNext(){
        return currentNode!=null;
    }

    public int next(){
        int data=currentNode.getData();

        currentNode=currentNode.getNext();

        return data;
    }

    Node getCurrentNode() { //cuando no se le pone nada de public o private a un getter
        // se le llama-> backage-private y solo es visible dentro de paquete en el que está declarado
        return currentNode;
    }
}

//iteradores
