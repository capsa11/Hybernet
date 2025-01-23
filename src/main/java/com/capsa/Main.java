package com.capsa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class Main{
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();


        System.out.println(session);
    }
}