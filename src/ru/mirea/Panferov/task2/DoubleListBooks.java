package ru.mirea.Panferov.task2;

public class DoubleListBooks {
    private BookNode head = null;

    public void addNodeHead(String title, String author, int age){
        BookNode newNode = new BookNode(title, author, age);
        if (head == null) head = newNode;
        else if (head.next == null){
            newNode.next = head;
            head = newNode;
        }
        else{

        }
    }

    public void addNodeHead(BookNode newNode){

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
