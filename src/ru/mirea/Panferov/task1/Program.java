package ru.mirea.Panferov.task1;

import java.util.List;

public class Program {
    static public void main(String[] args) {
        ListStudents students = new ListStudents();
        students.removeNodeHead();
        students.printList();
        System.out.println(students.isEmpty());
    }
}
