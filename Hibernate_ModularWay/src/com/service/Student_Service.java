package com.service;

import com.dao.Student_Dao;
import com.entity.Student;
import java.util.Scanner;

public class Student_Service 
{
    Student_Dao sd = new Student_Dao();
    Scanner sc = new Scanner(System.in);
    Student s = new Student();
    
    public void insert_Data() 
    {
        System.out.print("Enter Student Name: ");
        s.setStud_name(sc.nextLine());
        
        System.out.print("Enter Student City: ");
        s.setStud_city(sc.nextLine());
        
        System.out.print("Enter Student Division: ");
        s.setStud_division(sc.nextLine());
        
        sd.insert_Data(s);
    }

    public void update_Data() 
    {
        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();
        s.setStud_id(id);
        
        System.out.print("Enter New Student Name: ");
        s.setStud_name(sc.nextLine());
        
        System.out.print("Enter New Student City: ");
        s.setStud_city(sc.nextLine());
        
        System.out.print("Enter New Student Division: ");
        s.setStud_division(sc.nextLine());
        
        sd.update_Data(s);
    }

    public void delete_Data() 
    {
        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();
        sd.delete_Data(id);
    }

    public void displayAll_Data() 
    {
        sd.displayAll_Data();
    }

    public void displaySingle_Data() 
    {
        System.out.print("Enter Student ID to Display: ");
        int id = sc.nextInt();
        Student student = sd.displaySingle_Data(id);
        System.out.println(student);
    }
}
