package ru.mirea.Panferov.task1;

import java.util.List;

public class Program {
    static public void main(String[] args) {
        ListStudents students = new ListStudents();
        students.addNodeHead("Sergey", 19, 2);
        students.addNodeHead("Aleksey", 22, 4);
        students.addNodeHead("Pavel", 18, 1);
        students.addNodeTail("Kirill", 23, 5);
        students.addNodeIndex("Anton", 18, 1, 1);
        students.removeNodeTail();
        students.printList();
    }
}
