package ru.mirea.Panferov.task2;

import ru.mirea.Panferov.task1.StudentNode;

public class DoubleList {
    private BookNode head = null;

    public void addNodeHead(String title, String author, int age){
        BookNode tempNode = new BookNode(title, author, age);
        if (head == null){
            head = tempNode;
            tempNode = null;
        }
        else if (head.next != null){
            head.next.previous = tempNode;
            tempNode.next = head.next;
        }
        head.next = tempNode;
        if (tempNode != null) tempNode.previous = head;
    }

    public void removeNodeHead(){
        if (head.next != null){
            head = head.next;
            head.previous = null;
        }
        System.out.println("В списке 1 или 0 узлов");
    }

    public void addNodeTail(String title, String author, int age){
        BookNode tempNode = new BookNode(title, author, age);
        BookNode cycleNode = head;
        if (head == null){
            head = tempNode;
            cycleNode = head;
            tempNode = null;
        }
        while (cycleNode.next != null) cycleNode = cycleNode.next;
        cycleNode.next = tempNode;
        if (tempNode != null) tempNode.previous = cycleNode;
    }

    public void removeNodeTail(){
        BookNode cycleNode = head;
        BookNode previousCycleNode = cycleNode;
        while (cycleNode.next != null){
            previousCycleNode = cycleNode;
            cycleNode = cycleNode.next;
        }
        previousCycleNode.next = null;
    }

    public void addNodeIndex(String title, String author, int age, int index){
        BookNode tempNode = new BookNode(title, author, age);
        BookNode cycleNode = head;
        for (int i = 0; i < index-1; i++){
            cycleNode = cycleNode.next;
        }
        tempNode.next = cycleNode.next;
        tempNode.previous = cycleNode;
        cycleNode.next = tempNode;
    }

    public void printList(){
        BookNode tempNode = head;
        while(tempNode.next != null){
            System.out.print(tempNode + " <--> \n");
            tempNode = tempNode.next;
        }
        System.out.print(tempNode + "\n");
    }

}
