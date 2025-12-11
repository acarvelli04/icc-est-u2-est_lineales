package controllers;

import models.Node;

public class ListaEnlazada <T>{

    private Node<T> head;
    private Node<T> tail;
    private int size=0;

    

    public ListaEnlazada() {
    }

    public ListaEnlazada(Node<T> head, Node<T> tail, int size) {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    

    public void append(T data){
        Node<T> newNode = new Node<T>(data);
        if(head == null){
            //lleno dos
            head = newNode; 
            tail = newNode; 
            
        } else {
            tail.setNext(newNode);
            
            tail = newNode;
        }
        size++;
        // Tendre que llevar al ultimo
        // y eso agregar al nodo
        //Node<T> current = head;
        // while (current.getNext() != null){
        //     current = current.getNext();

        // }
        // current.setNext(new Node<T>(data));
        // size++;

    }

    public void deleteFirst() {
        // eliminar head
        if (head != null)
            head = head.getNext();
        size--;
        if (head == null)
            tail = null;

        
    }
    
    public void deleteLast(){
        //iterar y eliminar el ultimo
        if (tail == null)
            return;
        tail = tail.getPrev();
        size--;
    
        
    }

    public void deleteNode(T data) {
    if (head == null) 
        return;  //  vacía

    Node<T> current = head;

    // Buscar el nodo 
    while (current != null && !current.getValue().equals(data)) {
        current = current.getNext();
    }
    if (current == null) 
        return; // no hay
    // eliminar head
    if (current == head) {
        deleteFirst();
        return;
    }
    // eliminar tail
    if (current == tail) {
        deleteLast();
        return;
    }
    // eliminar nodo del medio
    current.getPrev().setNext(current.getNext());
    current.getNext().setPrev(current.getPrev());

    size--;
    }

    public void printAllNodes() {
        Node<T> current = head;
        System.out.print("Cima -> ");
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }

    public int size() {
        return size;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
