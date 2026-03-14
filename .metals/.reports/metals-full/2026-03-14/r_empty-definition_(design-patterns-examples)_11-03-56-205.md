error id: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/iterator/DepthFirstIterator.java:_empty_/`<any>`#isVisited#
file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/iterator/DepthFirstIterator.java
empty definition using pc, found symbol in pc: _empty_/`<any>`#isVisited#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 670
uri: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/iterator/DepthFirstIterator.java
text:
```scala
package com.minghui.designpatterns.behavioural.iterator;

import java.util.Deque;
import java.util.LinkedList;

public class DepthFirstIterator<T> implements Iterator<T> {

    private final Vertex<T> startVertex;
    private final Deque<Vertex<T>> stack = new LinkedList<>();

    public DepthFirstIterator(Vertex<T> startVertex) {
        this.startVertex = startVertex;
        stack.push(startVertex);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Vertex<T> getNext() {
        if (!hasNext()) {
            return null;
        }
        Vertex<T> current = stack.pop();
        if (!current.is@@Visited()) {
            current.setVisited(true);
            current.getNeighbors().forEach(stack::push);
            return current;
        }
        return getNext();
    }

    @Override
    public void reset() {
        stack.clear();
        stack.push(startVertex);
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/`<any>`#isVisited#