package ru.mirea.Panferov.task1;

import java.util.Scanner;

public class ListStudents {
    private StudentNode[] list;
    int count;
    static int counter = 0;

    public ListStudents(int count) {
        this.list = new StudentNode[count];
        this.count = count;
    }

    public ListStudents(){}

    public void createEmpty(){
        this.list = new StudentNode[0];
        this.count = 0;
    }

    public void addNode(StudentNode stdNode){
        this.list[counter] = stdNode;
        if (counter > 0) this.list[counter-1].nodeSetter(this.list[counter]);
        counter++;
    }

    public void removeNode(){
        counter--;
        this.list[counter] = null;
        this.list[counter-1].nodeSetter(null);
    }

    public StudentNode printNode(int index){
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
