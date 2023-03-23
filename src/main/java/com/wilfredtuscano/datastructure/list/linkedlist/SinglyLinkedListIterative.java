package com.wilfredtuscano.datastructure.list.linkedlist;

public class SinglyLinkedListIterative<T> extends SinglyLinkedList<T> {

    /**
     * <pre>
     * {@inheritDoc}
     * Time complexity => O(n)
     * Space complexity => O(1)
     * </pre>
     */
    @Override
    public boolean add(T value) {
        if (head == null) {
            head = new Node<>(value);
        } else {
            Node<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node<>(value);
        }
        size++;
        return true;
    }

    /**
     * <pre>
     * {@inheritDoc}
     * Time complexity => O(n)
     * Space complexity => O(1)
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

        Node<T> prev = head;
        Node<T> curr = head.next;
        while (curr != null) {
            if (curr.value == value) {
                prev.next = curr.next;
                size--;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
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

        Node<T> curr = head;
        while (curr != null) {
            if (curr.value == value) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

}
