package ru.mirea.Panferov.task4;

public class Node {
    private String string;
    public Node next;
    public Node previous;

    public Node(String string) {
        this.string = string;
        this.next = null;
        this.previous = null;
    }

    public String getString() { return string; }

    @Override
    public String toString() {
        return "Строка: " + string;
    }
}
