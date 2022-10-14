package ru.mirea.Panferov.task3;

public class Program {
    static public void main(String[] args){
        ProfileNode profileNode1 = new ProfileNode("eVOKZXC", "1234321", "evok@gmail.com");
        ProfileNode profileNode2 = new ProfileNode("Ahishka", "retywe123#", "ahishka@yandex.ru");
        ProfileNode profileNode3 = new ProfileNode("b0brT34", "Boberdl", "bobrt34@mail.ru");
        CircleList circleList = new CircleList(3);
        circleList.addNode(profileNode1);
        circleList.addNode(profileNode2);
        circleList.addNode(profileNode3);
        circleList.removeNode();
        circleList.printNode(1);
        circleList.clearList();
        System.out.println(circleList.isEmpty());
    }
}
