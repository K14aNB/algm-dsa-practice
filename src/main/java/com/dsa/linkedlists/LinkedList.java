package com.dsa.linkedlists;

import java.util.Optional;

public interface LinkedList<T> {

    Optional<Node<T>> getHeadNode();

    Optional<Node<T>> getTailNode();

    Optional<T> getNodeData(int index);

    int countNodes();

    void prepend(T data);

    void append(T data);

    void insert(int index, T data);

    Optional<T> remove(T data);

    Optional<T> removeAt(int index);

    int indexOf(T data);

    int lastIndexOf(T data);

    boolean contains(T data);

    void reverse();

    boolean isEmpty();

}
