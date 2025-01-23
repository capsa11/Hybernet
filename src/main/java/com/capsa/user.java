package com.capsa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.SequenceGenerators;

@Entity
public class user {
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
}

