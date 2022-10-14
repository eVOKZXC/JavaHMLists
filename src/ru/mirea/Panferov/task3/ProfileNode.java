package ru.mirea.Panferov.task3;

public class ProfileNode {
    private String login;
    private String password;
    private String email;
    private ProfileNode next;

    public ProfileNode(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public void setNext(ProfileNode next) { this.next = next; }

    @Override
    public String toString() {
        return "Данные пользователя: \nЛогин: " + login + "\nПароль: " + password + "\nE-mail: " + email;
    }
}
