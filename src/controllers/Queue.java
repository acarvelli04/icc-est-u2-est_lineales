package controllers;

import models.Node;

public class Queue <T> {

    private Node<T> first; //nodo al frente de la cola
    private Node<T> last;   //nodo al final de la cola
    private int size;
    
    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 1;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node<T>(data);
        if(isEmpty()){
            //lleno dos
            first = newNode;
            last = newNode;
        } else {
            //desplazo y agrego al final
            last.setNext(newNode);
            last = newNode;
        }
    } 

    
    

    public T dequeue(){
        if(!isEmpty()){
            //throw new NoSuchElementException("La cola no tiene elementos");
            return null;
        }
        T data = first.getValue();
        first = first.getNext();
        if(first == null){
            last = null;
        }
        return data;

    } 

    public void remove(){
        
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void printAllNodes() {
        Node<T> current = first;
        System.out.print("Cima -> ");
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
