package com.minghui.designpatterns.behavioural.iterator;

import java.util.List;

// extracts the traversal behaviour of a collection into a separate object called an iterator
// the iterator traverses the elements of a collection without exposing its underlying representation
// several iterators can go through the same collection at the same time

// clients don't create iterators on their own but instead retrieve them from collections
// this makes sure that the iterator being used is compatible with the collection

// single responsibility
// open-closed

public class MainApp {

    public static void main(String[] args) {

        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);
        Vertex<Integer> v6 = new Vertex<>(6);

        v0.setNeighbors(List.of(v1, v5, v6));
        v1.setNeighbors(List.of(v3, v4, v5));
        v4.setNeighbors(List.of(v2, v6));
        v6.setNeighbors(List.of(v0));

        System.out.println("Depth First Traversal:");
        DepthFirstIterator<Integer> dfs = new DepthFirstIterator<>(v0);
        while (dfs.hasNext()) {
            System.out.println(dfs.getNext());
        }

        // reset visited flags
        resetVisited(v0, v1, v2, v3, v4, v5, v6);

        System.out.println("\nBreadth First Traversal:");
        BreadthFirstIterator<Integer> bfs = new BreadthFirstIterator<>(v0);
        while (bfs.hasNext()) {
            System.out.println(bfs.getNext());
        }
    }

    private static void resetVisited(Vertex<?>... vertices) {
        for (Vertex<?> v : vertices) {
            v.setVisited(false);
        }
    }
}
