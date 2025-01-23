package com.capsa;

import jakarta.persistence.Entity;

@Entity
public class User {
    @jakarta.persistence.Id
    private int Id;
    private String Uname;
    private String Passwrd;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getPasswrd() {
        return Passwrd;
    }

    public void setPasswrd(String passwrd) {
        Passwrd = passwrd;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Uname='" + Uname + '\'' +
                ", Passwrd='" + Passwrd + '\'' +
                '}';
    }
}

