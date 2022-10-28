package ru.mirea.Panferov.task3;

public class Program {
    public static void main(String[] args) {
        CircleList circleList = new CircleList();
        circleList.addHead(new Node(12));
        circleList.addHead(new Node(32));
        circleList.addHead(new Node(-4));
        circleList.addHead(new Node(0));
        circleList.removeHead();
        circleList.addHead(new Node(0));
        circleList.addTail(new Node(7));
        circleList.removeTail();
        circleList.clear();
        System.out.println(circleList.findNode(12));
    }
}

