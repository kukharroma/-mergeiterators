package org.merge.proxy;

import java.util.Iterator;

public class Node {

    private final int value;
    private final Iterator<Integer> iterator;

    Node(int value, Iterator<Integer> iterator) {
        this.value = value;
        this.iterator = iterator;
    }

    public int getValue() {
        return value;
    }

    public Iterator<Integer> getIterator() {
        return iterator;
    }

}