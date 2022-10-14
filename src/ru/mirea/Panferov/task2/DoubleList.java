package ru.mirea.Panferov.task2;

public class DoubleList {

    private BookNode[] list;
    private int count;
    int counter = 0;

    public DoubleList(int count) {
        this.list = new BookNode[count];
        this.count = count;
    }

    public void createEmpty(){
        this.list = new BookNode[0];
        this.count = 0;
    }

    public void addNode(BookNode node){
        this.list[counter] = node;
        if (counter > 0){
            this.list[counter-1].setNext(this.list[counter]);
            this.list[counter].setPrevious(this.list[counter-1]);
        }
        if (count - 1 != counter) counter++;
    }

    public void removeNode(){
        this.list[counter] = null;
        this.list[counter-1].setNext(null);
        counter--;
    }

    public BookNode printNode(int n){
        return this.list[n];
    }

    public void clearList(){
        for (int i = 0; i < count; i++) this.list[i] = null;
    }

    public boolean isEmpty(){
        if (this.list[0] == null) return true;
        else return false;
    }

}
