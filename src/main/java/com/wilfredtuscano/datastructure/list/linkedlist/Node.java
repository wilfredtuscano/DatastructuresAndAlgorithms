package com.wilfredtuscano.datastructure.list.linkedlist;

public class Node<T> {

    /**
     * Value of the node.
     */
    T value;

    /**
     * Next node.
     */
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }

}
