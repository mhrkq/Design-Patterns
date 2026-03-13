package com.minghui.designpatterns.behavioural.memento;

// capture and restore an object's internal state without exposing its internal details

// Originator = a text editor
// Memento = a saved undo state
// Caretaker = the undo stack

// each Memento object represents a snapshot of the Originator at a specific time
// so the Originator might create many Mementos during its lifecycle

// the Originator creates the Memento
// the Caretaker stores the list/stack of Mementos (e.g., undo history)

public class MainApp {

    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.write("Bacon pancakes");
        editor.printText();
        editor.write("Bacon pancakes, makin' ");
        editor.printText();
        editor.write("Bacon pancakes, makin' bacon pancakes");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

    }

}
