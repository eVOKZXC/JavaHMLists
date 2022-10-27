package ru.mirea.Panferov.task2;

import ru.mirea.Panferov.task1.StudentNode;

public class DoubleListBooks {
    private BookNode head = null;

    public void addHead(String title, String author, int age){
        BookNode newNode = new BookNode(title, author, age);
        if (head == null) head = newNode;
        else if (head.next == null){
            newNode.next = head;
            head = newNode;
        }
        else{
            BookNode tempNode = head;
            BookNode tempNodeNext = head.next;
            head = newNode;
            head.next = tempNode;
            tempNode.previous = head;
            tempNodeNext.previous = tempNode;
        }
    }

    public void addHead(BookNode newNode){
        if (head == null) head = newNode;
        else if (head.next == null){
            newNode.next = head;
            head = newNode;
        }
        else{
            BookNode tempNode = head;
            BookNode tempNodeNext = head.next;
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

    public void addTail(String title, String author, int age){
        BookNode newNode = new BookNode(title, author, age);
        BookNode tempNode = head;
        while(tempNode.next != null) tempNode = tempNode.next;
        tempNode.next = newNode;
        newNode.previous = tempNode;
    }

    public void addTail(BookNode newNode){
        BookNode tempNode = head;
        while(tempNode.next != null) tempNode = tempNode.next;
        tempNode.next = newNode;
        newNode.previous = tempNode;
    }

    public void removeTail(){
        BookNode tempNode = head;
        BookNode cycleNode = tempNode;
        try {
            while (tempNode.next != null){
                cycleNode = tempNode;
                tempNode = tempNode.next;
            }
            cycleNode.next = null;
        }
        catch (NullPointerException e){ System.out.println("В списке нет элементов для удаления"); }
    }
    public BookNode findNode(String title){
        BookNode tempNode = head;
        try {
            while(!tempNode.getTitle().equals(title)){
                tempNode = tempNode.next;
            }
            return title.equals(tempNode.getTitle()) ? tempNode : null;
        }
        catch (NullPointerException e){ return null; }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        BookNode tempNode = head;
        try{
            while(tempNode.next != null){
                System.out.println(tempNode + " [" + (tempNode.previous == null ? null : tempNode.previous.getTitle()) + ", " + (tempNode.next == null ? null : tempNode.next.getTitle()) + "] ->");
                tempNode = tempNode.next;
            }
            System.out.println(tempNode + " [" + (tempNode.previous == null ? null : tempNode.previous.getTitle()) + ", " + (tempNode.next == null ? null : tempNode.next.getTitle()) + "]");
        }catch (NullPointerException e){
            System.out.println("В списке нет элементов, он пустой.");
        }
    }

}
