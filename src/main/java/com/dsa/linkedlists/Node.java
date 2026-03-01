package com.dsa.linkedlists;

public interface Node<T> {
    T getData();

    Node<T> getNextNode();

    Node<T> getPrevNode();

    void setNextNode(Node<T> node);

    void setPrevNode(Node<T> node);

}
