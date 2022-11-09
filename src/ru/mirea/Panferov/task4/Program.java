package ru.mirea.Panferov.task4;

public class Program {
    static public void main(String[] args){
        DoubleList list = new DoubleList();
        list.addTail("Бебра");
        list.addTail("Часы");
        list.addTail("Код");
        list.sort();
    }
}
