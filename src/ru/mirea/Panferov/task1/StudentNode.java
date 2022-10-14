package ru.mirea.Panferov.task1;

public class StudentNode {
    private String fullname;
    private int age;
    private int course;
    private StudentNode next = null;

    public StudentNode(String fullname, int age, int course) {
        this.fullname = fullname;
        this.age = age;
        this.course = course;
    }

    public void nodeSetter(StudentNode node){
        this.next = node;
    }

    @Override
    public String toString() {
        return "Ученик: " + fullname + ", " + age + " лет, " + course + " курс";
    }
}
