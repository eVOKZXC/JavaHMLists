package ru.mirea.Panferov.task2;

public class Program {
    static public void main(String[] args){
        DoubleListBooks books = new DoubleListBooks();
        BookNode bookNode = new BookNode("Соло 2", "Бустер", 2027);
        books.addHead("Бебра", "Бустер", 2021);
        books.addHead("Полный бак", "Бустер", 2022);
        books.addHead("Серый Полковник", "Бустер", 2022);
        books.addTail("Полный череп", "Бустер", 2022);
        books.addTail("Соло", "Бустер", 2020);
        books.addHead(bookNode);
        books.removeTail();
        books.print();
    }
}
