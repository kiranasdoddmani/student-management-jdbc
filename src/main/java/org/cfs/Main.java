package org.cfs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        StudentService studentService=new StudentService();
        int choice;
        do {
            System.out.println();
            System.out.println("-----Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Update Student");
            System.out.println("4. Search Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.println("Enter Your Choice");
             choice=sc.nextInt();

             switch (choice){    // email,couse,marks
                 case 1:
//                      System.out.println("Enter Student Id");
//                       int id=sc.nextInt();

                         sc.nextLine();

                       System.out.println("Enter Student name");
                       String name=sc.nextLine();

                       System.out.println("Enter Student Email");
                       String email=sc.nextLine();

                       System.out.println("Enter Student Course");
                       String course=sc.nextLine();

                       System.out.println("Enter Student Marks");
                       double marks=sc.nextDouble();

                 Student student=new Student(name,email,course,marks);
                  studentService.addStudent(student);
                  break;

                 case 2:
                     studentService.ViewAllStduents();
                     break;

                 case 3:
                     System.out.println("Enter Id for Updating");
                     int UId=sc.nextInt();

                     System.out.println("Enter New Marks");
                     double newMarks = sc.nextDouble();

                     studentService.UpdateStudent(UId,newMarks);
                     break;

                 case 5:
                     System.out.println("Enter Id For Deleteing");
                     int StudentId= sc.nextInt();
                     sc.nextLine();
                     studentService.DeleteStudent(StudentId);
                     break;

                 case 4:
                     System.out.println("Enter Id For Searching ");
                     int newId=sc.nextInt();
                     sc.nextLine();
                     studentService.SearchStudent(newId);
                     break;

                 default:
                     System.out.println("Invalid Choice");
             }
        }  while(choice !=6);
         sc.close();
    }
}
