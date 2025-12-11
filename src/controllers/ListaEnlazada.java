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
            size++;
            return;
        } 
        // Tendre que llevar al ultimo
        // y eso agregar al nodo
    }

}
