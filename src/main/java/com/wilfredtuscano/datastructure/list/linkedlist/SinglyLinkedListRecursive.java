package com.wilfredtuscano.datastructure.list.linkedlist;

public class SinglyLinkedListRecursive<T> extends SinglyLinkedList<T> {

    /**
     * <pre>
     * {@inheritDoc}
     * Time complexity => O(n)
     * Space complexity => O(n)
     * </pre>
     */
    @Override
    public boolean add(T value) {
        if (head == null) {
            head = new Node<>(value);
            size++;
            return true;
        }
        return addRecursive(head, value);
    }

    private boolean addRecursive(Node<T> curr, T value) {
        if (curr.next == null) {
            curr.next = new Node<T>(value);
            size++;
            return true;
        }
        return addRecursive(curr.next, value);
    }

    /**
     * <pre>
     * {@inheritDoc}
     * Time complexity => O(n)
     * Space complexity => O(n)
     * </pre>
     */
    @Override
    public boolean remove(T value) {
        if (head == null) {
            return false;
        }
        if (head.value == value) {
            head = head.next;
            size--;
            return true;
        }

        return removeRecursive(head, value);
    }

    private boolean removeRecursive(Node<T> curr, T value) {
        if (curr.next == null) {
            return false;
        }
        if (curr.next.value == value) {
            curr.next = curr.next.next;
            size--;
            return true;
        }

        return removeRecursive(curr.next, value);
    }

    /**
     * <pre>
     * {@inheritDoc}
     * Time complexity => O(n)
     * Space complexity => O(1)
     * </pre>
     */
    @Override
    public boolean contains(T value) {
        if (head == null) {
            return false;
        }

        return containsRecursive(head, value);
    }

    private boolean containsRecursive(Node<T> curr, T value) {
        if (curr == null) {
            return false;
        }
        if (curr.value == value) {
            return true;
        }

        return containsRecursive(curr.next, value);
    }

}
