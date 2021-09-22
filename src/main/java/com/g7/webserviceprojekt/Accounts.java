package com.g7.webserviceprojekt;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts {

    @Id
    private int ID;
    private String Name;
    private String Email;
    private String Password;
    private String Image;

    @Override
    public String toString() {
        return "Accounts{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Image='" + Image + '\'' +
                '}';
    }

    public Accounts() {
    }

    public Accounts(int id, String name, String email, String password, String image) {
        this.ID = id;
        this.Name = name;
        this.Email = email;
        this.Password = password;
        this.Image = image;
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

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
