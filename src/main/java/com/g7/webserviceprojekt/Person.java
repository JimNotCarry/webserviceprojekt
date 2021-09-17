package com.g7.webserviceprojekt;

import javax.persistence.Entity;
import javax.persistence.Id;

//Lucas

@Entity
public class Person {

    @Id
    private int ID;
    private String Name;
    private String Email;
    private String Password;

    public Person() {
    }
    public Person(int id, String name, String email, String password) {
        this.ID = id;
        this.Name = name;
        this.Email = email;
        this.Password = password;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
