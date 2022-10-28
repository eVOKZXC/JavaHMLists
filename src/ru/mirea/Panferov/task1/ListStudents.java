package ru.mirea.Panferov.task1;

import ru.mirea.Panferov.task2.BookNode;

public class ListStudents {

    private StudentNode head;

    public void addHead(String fullname, int age, int course) {
        StudentNode node = new StudentNode(fullname, age, course);
        if (head == null) head = node;
        else {
            StudentNode tempNode = head;
            head = node;
            head.next = tempNode;
        }
    }

    public void removeHead() {
        try {
            if (head.next != null) head = head.next;
        } catch (NullPointerException e) {
            System.out.println("В списке нет элементов для удаления");
        }
    }

    public void addHead(StudentNode node) {
        if (head == null) head = node;
        else {
            StudentNode tempNode = head;
            head = node;
            head.next = tempNode;
        }
    }

    public void addTail(String fullname, int age, int course) {
        StudentNode node = new StudentNode(fullname, age, course);
        StudentNode tempNode = head;
        while (tempNode.next != null) tempNode = tempNode.next;
        tempNode.next = node;
    }

    public void addTail(StudentNode node) {
        StudentNode tempNode = head;
        while (tempNode.next != null) tempNode = tempNode.next;
        tempNode.next = node;
    }

    public void removeTail() {
        StudentNode tempNode = head;
        StudentNode previousNode = tempNode;
        try {
            while (tempNode.next != null) {
                previousNode = tempNode;
                tempNode = tempNode.next;
            }
            previousNode.next = null;
        } catch (NullPointerException e) {
            System.out.println("В списке нет элементов для удаления");
        }
    }

    public void addIndex(String fullname, int age, int course, int index) {
        StudentNode node = new StudentNode(fullname, age, course);
        StudentNode tempNode = head;
        for (int i = 0; i < index - 1; i++) tempNode = tempNode.next;
        node.next = tempNode.next;
        tempNode.next = node;
    }

    public void addIndex(StudentNode node, int index) {
        StudentNode tempNode = head;
        for (int i = 0; i < index - 1; i++) tempNode = tempNode.next;
        node.next = tempNode.next;
        tempNode.next = node;
    }

    public void removeNode(String fullname) {
        StudentNode tempNode = head;
        StudentNode previousNode = tempNode;
        boolean flag = true;
        try {
            while (!tempNode.getFullname().equals(fullname)) {
                if (tempNode.next == null) {
                    flag = false;
                    break;
                }
                previousNode = tempNode;
                tempNode = tempNode.next;
            }
            if (flag) previousNode.next = tempNode.next;
        } catch (Exception e) {
            System.out.println("Невозможно удалить элемент");
        }
    }

    public void printList() {
        StudentNode tempNode = head;
        try {
            while (tempNode.next != null) {
                System.out.print(tempNode + " -> ");
                tempNode = tempNode.next;
            }
            System.out.print(tempNode + "\n");
        } catch (NullPointerException e) {
            System.out.println("В списке нет элементов, он пустой");
        }
    }

    public boolean isEmpty() {
        return head == null;
    }


}
