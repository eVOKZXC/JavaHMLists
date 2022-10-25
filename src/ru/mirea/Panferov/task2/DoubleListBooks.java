package ru.mirea.Panferov.task2;

import javax.sound.midi.Soundbank;

public class DoubleListBooks {
    private BookNode head = null;

    public void addNodeHead(String title, String author, int age){
        BookNode newNode = new BookNode(title, author, age);
        try {
            head = newNode;
            newNode.next = head.next;
        }catch (NullPointerException e){
            head.next.previous = newNode;
        }
    }

    public void addNodeHead(BookNode newNode){
        newNode.next = head;
        head = newNode;
        head.next.previous = head;
    }

    public void removeNodeHead(){
        try{
            head = head.next;
        }catch (NullPointerException e){
            System.out.println("Список пуст");
        }
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
