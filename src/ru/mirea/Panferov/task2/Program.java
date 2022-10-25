package ru.mirea.Panferov.task2;

public class Program {
    static public void main(String[] args){
        DoubleList doubleList = new DoubleList();
        doubleList.addNodeTail("Война и Мир", "Толстой", 1863);
        doubleList.addNodeTail("Отцы и Дети", "Тургенев", 1971);
        doubleList.addNodeTail("Отцы и Дети и Бебры", "Тургенев", 1971);
        doubleList.addNodeTail("Белая гвардия", "Булгаков", 1918);
        doubleList.addNodeIndex("Полный бак", "Полковник", 2021, 1);
        doubleList.addNodeIndex("Большие боссы", "Черепок", 1337, 3);
        doubleList.printList();
        }
}
