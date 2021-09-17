package com.g7.webserviceprojekt;

public class Person {

    private int ID;
    private String Name;
    private String Password;
    private String Email;

    public Person (int id, String name, String password, String email) {
        this.ID = id;
        this.Name = name;
        this.Password = password;
        this.Email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}