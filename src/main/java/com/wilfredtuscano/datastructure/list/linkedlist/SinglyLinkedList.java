package com.wilfredtuscano.datastructure.list.linkedlist;

import com.wilfredtuscano.datastructure.list.List;

public abstract class SinglyLinkedList<T> extends List<T> {

    Node<T> head = null;

    /**
     * <pre>
     * {@inheritDoc}
     * Time complexity => O(1)
     * Space complexity => O(1)
     * </pre>
     */
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * <pre>
     * {@inheritDoc}
     * Time complexity => O(1)
     * Space complexity => O(1)
     * </pre>
     */
    @Override
    public int size() {
        return size;
    }

}
