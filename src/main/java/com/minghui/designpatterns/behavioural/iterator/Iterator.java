package com.minghui.designpatterns.behavioural.iterator;

public interface Iterator<T> {

    boolean hasNext();

    Vertex<T> getNext();

    void reset();

}
