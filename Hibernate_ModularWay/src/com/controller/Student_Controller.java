package com.controller;

import com.service.Student_Service;
import java.util.Scanner;

public class Student_Controller 
{
    public static void main(String[] args) 
    {
        Student_Service ss = new Student_Service();
        
        Scanner sc = new Scanner(System.in);
        int option;

        do 
        {
            System.out.println("\n*************************************************");
            System.out.println("            😊 Student Management Menu 😊       ");
            System.out.println("*************************************************");
            System.out.println("  1. ➤ Insert New Student Data");
            System.out.println("  2. ➤ Update Existing Student Data");
            System.out.println("  3. ➤ Delete Student Data");
            System.out.println("  4. ➤ Display All Student Records");
            System.out.println("  5. ➤ Display Single Student Record");
            System.out.println("  6. ➤ Exit Program");
            System.out.println("*************************************************");
            System.out.print("👉 Choose Option: ");
            
            option = sc.nextInt();

            switch (option) 
            {
                case 1:
                    ss.insert_Data();
                    break;
                    
                case 2:
                    ss.update_Data();
                    break;
                    
                case 3:
                    ss.delete_Data();
                    break;
                    
                case 4:
                    ss.displayAll_Data();
                    break;
                    
                case 5:
                    ss.displaySingle_Data();
                    break;
                    
                case 6:
                    System.out.println("Program Exited.....");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
        while (option != 6);

        sc.close();
    }
}
