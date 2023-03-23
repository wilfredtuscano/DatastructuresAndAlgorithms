package com.wilfredtuscano.datastructure.list.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SinglyLinkedListRecursiveTest {

    @Test
    void add() {
        SinglyLinkedListRecursive<Integer> singlyLinkedList = new SinglyLinkedListRecursive<>();
        // ->
        Assertions.assertTrue(singlyLinkedList.add(5));
        Assertions.assertTrue(singlyLinkedList.add(8));
        Assertions.assertTrue(singlyLinkedList.add(15));
        // 5 -> 8 -> 15 ->
        Assertions.assertEquals(5, singlyLinkedList.head.value);
        Assertions.assertEquals(8, singlyLinkedList.head.next.value);
        Assertions.assertEquals(15, singlyLinkedList.head.next.next.value);
        Assertions.assertEquals(3, singlyLinkedList.size());
    }

    @Test
    void remove() {
        SinglyLinkedListRecursive<Integer> singlyLinkedList = new SinglyLinkedListRecursive<>();
        // ->
        Assertions.assertFalse(singlyLinkedList.remove(5));
        singlyLinkedList.add(1);
        singlyLinkedList.add(5);
        singlyLinkedList.add(8);
        singlyLinkedList.add(15);
        // 1 -> 5 -> 8 -> 15 ->
        Assertions.assertFalse(singlyLinkedList.remove(20));
        Assertions.assertEquals(4, singlyLinkedList.size());
        Assertions.assertTrue(singlyLinkedList.remove(1));
        // 5 -> 8 -> 15 ->
        Assertions.assertEquals(3, singlyLinkedList.size());
        Assertions.assertTrue(singlyLinkedList.remove(15));
        // 5 -> 8 ->
        Assertions.assertEquals(8, singlyLinkedList.head.next.value);
        Assertions.assertTrue(singlyLinkedList.remove(8));
        // 5 ->
        Assertions.assertNull(singlyLinkedList.head.next);
        Assertions.assertTrue(singlyLinkedList.remove(5));
        // ->
        Assertions.assertEquals(0, singlyLinkedList.size());
    }

    @Test
    void contains() {
        SinglyLinkedListRecursive<Integer> singlyLinkedList = new SinglyLinkedListRecursive<>();
        // ->
        Assertions.assertFalse(singlyLinkedList.contains(5));
        singlyLinkedList.add(5);
        // 5 ->
        Assertions.assertTrue(singlyLinkedList.contains(5));
        singlyLinkedList.add(8);
        singlyLinkedList.add(15);
        // 5 -> 8 -> 15 ->
        Assertions.assertTrue(singlyLinkedList.contains(8));
        Assertions.assertTrue(singlyLinkedList.contains(15));
        Assertions.assertFalse(singlyLinkedList.contains(10));
    }

}
