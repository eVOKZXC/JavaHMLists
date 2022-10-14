package ru.mirea.Panferov.task3;

import ru.mirea.Panferov.task1.StudentNode;

public class CircleList {
    private ProfileNode[] list;
    int count;
    static int counter = 0;

    public CircleList(int count) {
        this.list = new ProfileNode[count];
        this.count = count;
    }

    public CircleList(){}

    public void createEmpty(){
        this.list = new ProfileNode[0];
        this.count = 0;
    }

    public void addNode(ProfileNode stdNode){
        this.list[counter] = stdNode;
        if (counter > 0) this.list[counter-1].setNext(this.list[counter]);
        if (counter + 1 == count) this.list[counter].setNext(this.list[0]);
        counter++;
    }

    public void removeNode(){
        counter--;
        this.list[counter] = null;
        this.list[counter-1].setNext(this.list[0]);
    }

    public ProfileNode printNode(int index){
        return this.list[index];
    }

    public void clearList(){
        for (int i = 0; i < count; i++)
            this.list[i] = null;
    }

    public boolean isEmpty(){
        if (this.list[0] == null) return true;
        else return false;
    }
}
