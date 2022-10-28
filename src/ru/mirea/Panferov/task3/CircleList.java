package ru.mirea.Panferov.task3;

public class CircleList {
    public Node head;

    public boolean isEmpty() {
        return head == null;
    }
    public void addHead(Node node) {
        if (head == null) {
            head = node;
            head.next = head;
        } else {
            Node tempNode = head;
            while (tempNode.next != head) tempNode = tempNode.next;
            tempNode.next = node;
            tempNode = head;
            head = node;
            head.next = tempNode;
        }
    }
    public void addHead(int num){
        Node node = new Node(num);
        if (head == null) {
            head = node;
            head.next = head;
        } else {
            Node tempNode = head;
            while (tempNode.next != head) tempNode = tempNode.next;
            tempNode.next = node;
            tempNode = head;
            head = node;
            head.next = tempNode;
        }
    }
    public void removeHead(){
        Node tempNode = head;
        while(tempNode.next != head) tempNode = tempNode.next;
        head = head.next;
        tempNode.next = head;
    }
    public void addTail(Node node){
        Node tempNode = head;
        while(tempNode.next != head) tempNode = tempNode.next;
        node.next = head;
        tempNode.next = node;
    }
    public void addTail(int num){
        Node node = new Node(num);
        Node tempNode = head;
        while(tempNode.next != head) tempNode = tempNode.next;
        node.next = head;
        tempNode.next = node;
    }
    public void removeTail(){
        Node tempNode = head;
        Node previousNode = tempNode;

        while (tempNode.next != head){
            previousNode = tempNode;
            tempNode = tempNode.next;
        }
        previousNode.next = head;
    }
    public boolean findNode(int num){
        Node tempNode = head;
        try{
            while (tempNode.next != head){
                if (tempNode.getNum() == num) return true;
                tempNode = tempNode.next;
            }
            return tempNode.getNum() == num;
        }catch(Exception e){
            System.out.println("Список пустой");
            return false;
        }
    }
    public void clear(){ head = null; }


}
