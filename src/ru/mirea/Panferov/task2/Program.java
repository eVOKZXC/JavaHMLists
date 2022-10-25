package ru.mirea.Panferov.task2;

public class Program {
    static public void main(String[] args){
        DoubleListBooks books = new DoubleListBooks();
        BookNode bookNode = new BookNode("Соло 2", "Бустер", 2027);
        books.addNodeHead("Бебра", "Бустер", 2021);
        books.addNodeHead("Полный бак", "Бустер", 2022);
        books.addNodeHead("Соло", "Бустер", 2020);
        books.addNodeHead(bookNode);
        books.print();
    }
}
