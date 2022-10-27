package ru.mirea.Panferov.task1;

import java.util.List;

public class Program {
    static public void main(String[] args) {
        ListStudents students = new ListStudents();
        students.addHead("Андрей", 18, 1);
        students.addHead("Сергей", 20, 3);
        students.addHead("Кирилл", 22, 5);
        students.addHead("Антон", 19, 2);
        students.removeNodeHead();
        students.printList();
    }
}
