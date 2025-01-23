package com.capsa;

import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Main{
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

//        User user = new User();
//        user.setId(101);
//        user.setUname("Kala");
//        user.setPasswrd("Bh00t@");

//        session.persist(user);

        Transaction tx = session.beginTransaction();


//        User user1 = session.get(User.class, 100);
//        System.out.println(user1.getUname());

        User user2 = session.find(User.class,100);
        System.out.println(user2.getUname()+":"+user2.getPasswrd());

//        session.merge("User",user);

        tx.commit();


//        IdentifierLoadAccess<User> byId = session.byId("100");
//        System.out.println(byId);



        session.close();
    }
}