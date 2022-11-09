package ru.mirea.Panferov.task4;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleList {
    private Node head = null;

    public void addHead(String string){
        Node newNode = new Node(string);
        if (head == null) head = newNode;
        else if (head.next == null){
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        else{
            Node tempNode = head;
            Node tempNodeNext = head.next;
            head = newNode;
            head.next = tempNode;
            tempNode.previous = head;
            tempNodeNext.previous = tempNode;
        }
    }

    public void addHead(Node newNode){
        if (head == null) head = newNode;
        else if (head.next == null){
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        else{
            Node tempNode = head;
            Node tempNodeNext = head.next;
            head = newNode;
            head.next = tempNode;
            tempNode.previous = head;
            tempNodeNext.previous = tempNode;
        }
    }

    public void removeHead(){
        try{
            head = head.next;
            head.previous = null;
        }catch (NullPointerException e){ System.out.println("Список пуст"); }
    }

    public void sort(){
        ArrayList<String> list = new ArrayList<>();
        Node tempNode = head;
        while(tempNode.next != null){
            list.add(tempNode.getString());
            tempNode = tempNode.next;
        }
        list.add(tempNode.getString());
        Collections.sort(list);
        System.out.println(list);
    }

    public void addTail(String string){
        Node newNode = new Node(string);
        if (head == null){
            head = newNode;
        }else{
            Node tempNode = head;
            while(tempNode.next != null) tempNode = tempNode.next;
            tempNode.next = newNode;
            newNode.previous = tempNode;
        }
    }

    public void addTail(Node newNode){
        if (head == null){
            head = newNode;
        }else{
            Node tempNode = head;
            while(tempNode.next != null) tempNode = tempNode.next;
            tempNode.next = newNode;
            newNode.previous = tempNode;
        }
    }

    public void removeTail(){
        Node tempNode = head;
        Node cycleNode = tempNode;
        try {
            while (tempNode.next != null){
                cycleNode = tempNode;
                tempNode = tempNode.next;
            }
            cycleNode.next = null;
        }
        catch (NullPointerException e){ System.out.println("В списке нет элементов для удаления"); }
    }
    public Node findNode(String string){
        Node tempNode = head;
        try {
            while(!tempNode.getString().equals(string)){
                tempNode = tempNode.next;
            }
            return string.equals(tempNode.getString()) ? tempNode : null;
        }
        catch (NullPointerException e){ return null; }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        Node tempNode = head;
        try{
            while(tempNode.next != null){
                System.out.println(tempNode + " [" + (tempNode.previous == null ? null : tempNode.previous.getString()) + ", " + (tempNode.next == null ? null : tempNode.next.getString()) + "] ->");
                tempNode = tempNode.next;
            }
            System.out.println(tempNode + " [" + (tempNode.previous == null ? null : tempNode.previous.getString()) + ", " + (tempNode.next == null ? null : tempNode.next.getString()) + "]");
        }catch (NullPointerException e){
            System.out.println("В списке нет элементов, он пустой.");
        }
    }

}
