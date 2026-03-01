package com.dsa.linkedlists;

public class SinglyLinkedNode<T> implements Node<T> {

    private T data;
    private Node<T> next;
    private Node<T> prev;

    public SinglyLinkedNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public SinglyLinkedNode(T data, Node<T> next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getNextNode() {
        return this.next;
    }

    public Node<T> getPrevNode() {
        return null;
    }

    public void setNextNode(Node<T> node) {
        this.next = node;
    }

    public void setPrevNode(Node<T> node) {
        this.prev = null;
    }

}
