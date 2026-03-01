package com.dsa.linkedlists;

public class DoublyLinkedNode<T> implements Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;

    public DoublyLinkedNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DoublyLinkedNode(T data, Node<T> next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    public DoublyLinkedNode(T data, Node<T> next, Node<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getNextNode() {
        return this.next;
    }

    public Node<T> getPrevNode() {
        return this.prev;
    }

    public void setNextNode(Node<T> node) {
        this.next = node;
    }

    public void setPrevNode(Node<T> node) {
        this.prev = node;
    }

}
