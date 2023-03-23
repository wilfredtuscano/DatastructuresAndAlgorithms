package com.wilfredtuscano.datastructure.list.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void clear() {
        SinglyLinkedListIterative<Integer> singlyLinkedList = new SinglyLinkedListIterative<>();
        // ->
        singlyLinkedList.add(5);
        singlyLinkedList.add(8);
        singlyLinkedList.add(15);
        // 5 -> 8 -> 15 ->
        Assertions.assertEquals(3, singlyLinkedList.size());
        singlyLinkedList.clear();
        // ->
        Assertions.assertEquals(0, singlyLinkedList.size());
    }

}
