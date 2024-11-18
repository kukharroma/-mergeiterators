package org.fixture.proxy;

import java.util.*;

public class MergedIterator implements Iterator<Integer> {

    private final PriorityQueue<Node> priorityQueue;

    public MergedIterator(List<Iterator<Integer>> iterators) {
        priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Node::getValue));
        for (Iterator<Integer> it : iterators) {
            if (it.hasNext()) {
                priorityQueue.offer(new Node(it.next(), it));
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !priorityQueue.isEmpty();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        Node node = priorityQueue.poll();
        int value = node.getValue();

        if (node.getIterator().hasNext()) {
            priorityQueue.offer(new Node(node.getIterator().next(), node.getIterator()));
        }
        return value;
    }

}
