package ru.mirea.Panferov.task1;

import java.util.List;

public class Program {
    static public void main(String[] args){
        StudentNode first = new StudentNode("Sergey", 20, 3);
        StudentNode second = new StudentNode("Andrey", 22, 5);
        StudentNode third = new StudentNode("Vladimir", 18, 1);
        ListStudents students = new ListStudents(3);
        students.addNode(first);
        students.addNode(second);
        students.addNode(third);
        students.removeNode();
        students.addNode(third);
        System.out.println(students.printNode(0));
        System.out.println(students.isEmpty());
    }
}
