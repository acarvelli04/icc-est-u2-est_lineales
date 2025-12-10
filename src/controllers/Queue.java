package controllers;

import models.*;

public class Queue <T> {

    private Node<T> algo;
    
    public Queue(Node<T> algo) {
        this.algo = algo;
    }

    public void add(T data){
        
    }

    public void remove(){
        
    }

    public T peek(){
        if(algo == null)
            return null;
        return algo.getValue();
    }

    public boolean isEmpty(){
        return algo==null;
    }
}
