package ru.mirea.Panferov.task1;

import java.util.Scanner;

public class ListStudents {

    private StudentNode head;

    public void addNodeHead(String fullname, int age, int course){
        StudentNode node = new StudentNode(fullname, age, course);
        if (head == null){
            head = node;
            node = null;
        }
        else if (head.next != null){
            node.next = head.next;
        }
        head.next = node;
    }

    public void removeNodeHead(){
        if (head.next != null ) head = head.next;
        else System.out.println("В списке 1 или 0 узлов");
    }

    public void addNodeTail(String fullname, int age, int course){
        StudentNode node = new StudentNode(fullname, age, course);
        StudentNode tempNode = head;
        while(tempNode.next != null) tempNode = tempNode.next;
        tempNode.next = node;
    }

    public void removeNodeTail(){
        StudentNode tempNode = head;
        StudentNode previousNode = tempNode;
        while (tempNode.next != null){
            previousNode = tempNode;
            tempNode = tempNode.next;
        }
        previousNode.next = null;
    }

    public void addNodeIndex(String fullname, int age, int course, int index){
        StudentNode node = new StudentNode(fullname, age, course);
        StudentNode tempNode = head;
        for (int i = 0; i < index-1; i++){
            tempNode = tempNode.next;
        }
        node.next = tempNode.next;
        tempNode.next = node;
    }

    public void removeNode(String fullname){
        StudentNode tempNode = head;
        StudentNode previousNode = tempNode;
        boolean flag = true;
        while(!tempNode.getFullname().equals(fullname)){
            if (tempNode.next == null) {
                flag = false;
                break;
            }
            previousNode = tempNode;
            tempNode = tempNode.next;
        }
        if (flag){
            previousNode.next = tempNode.next;
        }
    }

    public void printList(){
        StudentNode tempNode = head;
        while(tempNode.next != null){
            System.out.print(tempNode + " -> ");
            tempNode = tempNode.next;
        }
        System.out.print(tempNode + "\n");
    }


}
