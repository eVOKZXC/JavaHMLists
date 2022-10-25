package ru.mirea.Panferov.task2;

public class BookNode {
    private String title;
    private String author;
    private int age;
    public BookNode next = null;
    public BookNode previous = null;

    public BookNode(String title, String author, int age) {
        this.title = title;
        this.author = author;
        this.age = age;
    }

    public String getTitle() { return title; }

    @Override
    public String toString() {
        return String.format("\"%s\", Автор: %s, Дата издателсьтва: %d год", title, author, age);
    }
}
