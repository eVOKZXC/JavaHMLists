package ru.mirea.Panferov.task2;

public class Program {
    static public void main(String[] args){
        BookNode bookNode = new BookNode("Война и Мир", "Толстой", 1863);
        BookNode bookNode1 = new BookNode("Отцы и Дети", "Тургенев", 1971);
        BookNode bookNode2 = new BookNode("Белая гвардия", "Булгаков", 1918);

        DoubleList mas = new DoubleList(3);
        mas.addNode(bookNode);
        mas.addNode(bookNode1);
        mas.addNode(bookNode2);
        mas.removeNode();
        System.out.println(mas.printNode(0));
        System.out.println(mas.printNode(1));
        mas.clearList();
        System.out.println(mas.isEmpty());
        }
}
