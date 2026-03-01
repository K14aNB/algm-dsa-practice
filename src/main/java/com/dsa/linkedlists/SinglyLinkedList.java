package com.dsa.linkedlists;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SinglyLinkedList<T> implements LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public SinglyLinkedList(List<T> data) {
        if (data == null || data.size() == 0) {
            this.head = null;
            this.tail = null;
        } else {
            for (T item : data) {
                append(item);
            }
        }
    }

    public Optional<Node<T>> getHeadNode() {
        return Optional.ofNullable(this.head);
    }

    public Optional<Node<T>> getTailNode() {
        return Optional.ofNullable(this.tail);
    }

    public Optional<T> getNodeData(int index) {
        if (index <= this.size - 1 && index >= 0) {
            if (index == 0) {
                return Optional.ofNullable(this.head.getData());
            } else if (index == this.size - 1) {
                return Optional.ofNullable(this.tail.getData());
            } else {
                Node<T> currentNode = this.head.getNextNode();
                for (int i = 1; i < index; i++) {
                    currentNode = currentNode.getNextNode();
                    if (currentNode == null) {
                        break;
                    }
                }
                return Optional.ofNullable(currentNode.getData());
            }

        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int countNodes() {
        return this.size;
    }

    public void prepend(T data) {
        Node<T> newHeadNode = new SinglyLinkedNode<T>(data, this.head);
        this.head = newHeadNode;
        if (this.size == 0) {
            this.tail = this.head;
        }
        this.size++;
    }

    public void append(T data) {
        Node<T> newTailNode = new SinglyLinkedNode<>(data);
        if (this.size == 0) {
            this.head = this.tail = newTailNode;
        } else {
            this.tail.setNextNode(newTailNode);
            this.tail = newTailNode;
        }
        this.size++;

    }

    public void insert(int index, T data) {
        if (index == 0) {
            prepend(data);
        } else if (index >= this.size) {
            append(data);
        } else {
            Node<T> newNode = new SinglyLinkedNode<>(data);
            Node<T> currentNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNextNode();
            }

            newNode.setNextNode(currentNode);
            currentNode.setNextNode(newNode);
            this.size++;
        }
    }

    public Optional<T> remove(T data) {
        Optional<T> removedNodeData = Optional.empty();
        if (Objects.equals(this.head.getData(), data)) {
            removedNodeData = Optional.ofNullable(this.head.getData());
            this.head = this.head.getNextNode();
            if (this.size == 1) {
                this.tail = null;
            }
            this.size--;
        } else {
            Node<T> prevNode = this.head;
            Node<T> currentNode = this.head.getNextNode();
            while (currentNode != null) {
                if (Objects.equals(currentNode.getData(), data)) {
                    prevNode.setNextNode(currentNode.getNextNode());
                    if (prevNode.getNextNode() == null) {
                        this.tail = prevNode;
                    }
                    this.size--;
                    removedNodeData = Optional.ofNullable(currentNode.getData());
                    break;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.getNextNode();
                }
            }
        }
        return removedNodeData;

    }

    public Optional<T> removeAt(int index) {
        Optional<T> removedNodeData = Optional.empty();
        if (index == 0) {
            removedNodeData = remove(this.head.getData());
        } else {
            Node<T> prevNode = this.head;
            Node<T> currentNode = this.head.getNextNode();
            for (int i = 1; i <= index; i++) {
                if (i == index) {
                    removedNodeData = Optional.ofNullable(currentNode.getData());
                    prevNode.setNextNode(currentNode.getNextNode());
                    if (index == this.size - 1) {
                        this.tail = prevNode;
                    }
                    this.size--;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.getNextNode();

                }
            }
        }
        return removedNodeData;
    }

    public int indexOf(T data) {
        int index = -1;
        if (Objects.equals(this.head.getData(), data)) {
            index = 0;
        } else if (Objects.equals(this.tail.getData(), data)) {
            index = this.size - 1;
        } else {
            Node<T> currentNode = this.head.getNextNode();
            for (int i = 1; i < this.size - 1; i++) {
                if (Objects.equals(currentNode.getData(), data)) {
                    index = i;
                    break;
                } else {
                    currentNode = currentNode.getNextNode();
                }
            }
        }
        return index;
    }

    public int lastIndexOf(T data) {
        if (Objects.equals(this.tail.getData(), data)) {
            return this.size - 1;
        } else {
            int lastIndex = -1;
            Node<T> currentNode = this.head;
            for (int i = 0; i < this.size - 1; i++) {
                if (Objects.equals(currentNode.getData(), data)) {
                    lastIndex = i;
                }
                currentNode = currentNode.getNextNode();
            }
            return lastIndex;
        }

    }

    public boolean contains(T data) {
        if (Objects.equals(this.head.getData(), data)
                || Objects.equals(this.tail.getData(), data)) {
            return true;
        } else {
            Node<T> currentNode = this.head.getNextNode();
            while (currentNode != null) {
                if (Objects.equals(currentNode.getData(), data)) {
                    return true;
                }
                currentNode = currentNode.getNextNode();
            }
        }
        return false;
    }

    public void reverse() {
        if (this.size <= 1) {
            return;
        } else {
            Node<T> prevNode = null;
            Node<T> currentNode = this.head;
            Node<T> nextNode = null;
            this.tail = this.head;
            while (currentNode != null) {
                nextNode = currentNode.getNextNode();
                currentNode.setNextNode(prevNode);
                prevNode = currentNode;
                currentNode = nextNode;
            }
            this.head = prevNode;
        }
    }

    public boolean isEmpty() {
        return (this.head == null || this.tail == null) && this.size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.head == null) {
            return null;
        } else {
            sb.append("||");
            sb.append("head:");
            sb.append(this.head.getData());
            if (this.size == 1) {
                sb.append(";tail:");
                sb.append(this.head.getData());
            }
            sb.append("||");
            sb.append("--->");
            if (this.size == 1) {
                sb.append("NULL");
            }
            Node<T> currentNode = this.head.getNextNode();
            for (int i = 1; i < this.size - 1; i++) {
                sb.append("||");
                sb.append("NODE-");
                sb.append(i);
                sb.append(":");
                sb.append(currentNode.getData());
                sb.append("||");
                sb.append("--->");
                currentNode = currentNode.getNextNode();
            }
            if (this.size > 1) {
                sb.append("||");
                sb.append("tail:");
                sb.append(this.tail.getData());
                sb.append("||");
                sb.append("--->");
                sb.append("NULL");
            }

        }
        return sb.toString();
    }

}
