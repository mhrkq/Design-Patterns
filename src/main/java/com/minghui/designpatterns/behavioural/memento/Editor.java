package com.minghui.designpatterns.behavioural.memento;

import com.minghui.designpatterns.behavioural.memento.TextArea.Memento;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {

    private final TextArea textArea;
    private final Deque<Memento> stateHistory;

    public Editor() {
        textArea = new TextArea();
        stateHistory = new LinkedList<>();
    }

    public void write(String text) {
        textArea.set(text);
        stateHistory.offer(textArea.takeSnapshot());
    }

    public void undo() {
        if (stateHistory.isEmpty()) {
            return;
        }
        stateHistory.pollLast();
        textArea.restore(stateHistory.peekLast());
    }

    public void printText() {
        System.out.println(textArea.getText());
    }

}
