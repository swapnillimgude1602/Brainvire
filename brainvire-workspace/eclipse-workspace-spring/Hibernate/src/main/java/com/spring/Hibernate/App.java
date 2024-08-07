package com.spring.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.Entity.teacherEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        teacherEntity te = new teacherEntity();
        te.setTeacherID(101);
        te.setTeacherName("Swapnil");
        te.setTeachingSubject("java");
        
        
        Configuration config = new Configuration().configure("hibernate-config.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(te);
        transaction.commit();
        session.close();
    }
}
