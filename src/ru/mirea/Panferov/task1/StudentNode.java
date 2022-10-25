package ru.mirea.Panferov.task1;

public class StudentNode {
    private String fullname;
    private int age;
    private int course;
    public StudentNode next = null;

    public StudentNode(String fullname, int age, int course) {
        this.fullname = fullname;
        this.age = age;
        this.course = course;
    }

    public String getFullname() { return fullname; }

    @Override
    public String toString() {
        return "Студент: " + fullname + ", " + age + " лет, " + course + " курс";
    }
}
