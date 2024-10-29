package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

public class Student_Dao 
{
    public void insert_Data(Student s) 
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
    	
        ss.persist(s);
        System.out.println("Data Inserted");
        
        t.commit();
        ss.close();
    }

    public void update_Data(Student s) 
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
		
        String hqlQuery = "update Student set stud_name = :myname, stud_city = :mycity, stud_division = :mydivision where stud_id = :myid";
        
        Query<Student> query = ss.createQuery(hqlQuery);
        
        query.setParameter("myname", s.getStud_name());
        query.setParameter("mycity", s.getStud_city());
        query.setParameter("mydivision", s.getStud_division());
        query.setParameter("myid", s.getStud_id());
        
        query.executeUpdate();
        
        System.out.println("Data Updated");
        
        t.commit();
        ss.close();
    }

    public void delete_Data(int myid) 
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
    	
        String hqlQuery = "delete from Student where stud_id = :myid";
        
        Query<Student> query = ss.createQuery(hqlQuery);
        query.setParameter("myid", myid);
        
        query.executeUpdate();
        
        System.out.println("Record Deleted");
       
        t.commit();
        ss.close();
    }

    public void displayAll_Data() 
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
       
        String hqlQuery = "from Student";
        Query<Student> query = ss.createQuery(hqlQuery, Student.class);
        List<Student> list = query.getResultList();
      
        System.out.println("Student Details:");
        
        for (Student student : list) 
        {
            System.out.println(student);
        }
        t.commit();
        ss.close();
    }

    public Student displaySingle_Data(int myid) 
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
        
        String hqlQuery = "from Student where stud_id = :myid";
        Query<Student> query = ss.createQuery(hqlQuery, Student.class);
        query.setParameter("myid", myid);
        
        Student student = query.getSingleResult();
        t.commit();
        ss.close();
        return student;
    }
}
