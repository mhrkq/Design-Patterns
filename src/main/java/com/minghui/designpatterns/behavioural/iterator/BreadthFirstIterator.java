package com.minghui.designpatterns.behavioural.iterator;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstIterator<T> implements Iterator<T> {

    private final Vertex<T> startVertex;
    private final Queue<Vertex<T>> queue = new LinkedList<>();

    public BreadthFirstIterator(Vertex<T> startVertex) {
        this.startVertex = startVertex;
        queue.offer(startVertex);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Vertex<T> getNext() {
        if (!hasNext()) {
            return null;
        }

        Vertex<T> current = queue.poll();

        if (!current.isVisited()) {
            current.setVisited(true);
            current.getNeighbors().forEach(queue::offer);
            return current;
        }

        return getNext();
    }

    @Override
    public void reset() {
        queue.clear();
        queue.offer(startVertex);
    }
}
