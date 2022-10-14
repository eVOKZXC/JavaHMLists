package ru.mirea.Panferov.task2;

public class BookNode {
    private String title;
    private String author;
    private int age;
    private BookNode next = null;
    private BookNode previous = null;

    public BookNode(String title, String author, int age) {
        this.title = title;
        this.author = author;
        this.age = age;
    }

    public void setNext(BookNode next) { this.next = next; }
    public void setPrevious(BookNode previous) { this.previous = previous; }

    @Override
    public String toString() {
        return "Книга: " + title + ", автор - " + author + ", дата издательства - " + age + " год";
    }
}
