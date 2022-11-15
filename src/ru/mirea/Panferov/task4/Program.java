package ru.mirea.Panferov.task4;

public class Program {
    static public void main(String[] args){
        DoubleList list = new DoubleList();
        list.addTail("Бебра");
        list.addTail("Череп");
        list.addTail("АМ");
        list.addTail("Радик");
        list.addTail("Математика");
        list.addTail("Часы");
        list.addTail("Клавиша");
        list.addTail("Код");
        list = list.sort();
        list.print();
    }
}
