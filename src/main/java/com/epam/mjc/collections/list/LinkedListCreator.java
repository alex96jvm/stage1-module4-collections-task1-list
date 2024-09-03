package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer el : sourceList) {
            if (el % 2 == 0) {
                linkedList.addLast(el);
            } else {
                linkedList.addFirst(el);
            }
        }
        return linkedList;
    }
}
