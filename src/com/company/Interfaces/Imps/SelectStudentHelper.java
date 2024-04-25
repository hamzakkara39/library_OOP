package com.company.Interfaces.Imps;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.ForAdmin;
import com.company.Interfaces.GenerateStudent;
import com.company.Interfaces.SelectStudent;

import java.util.Scanner;

public class SelectStudentHelper implements SelectStudent {
    @Override
    public void selectStudent(String name) {
        GenerateStudent sG = new GenerateStudentHelper();
     boolean numeric = true;
     numeric = name.matches("-?\\d+(\\.\\d+)?");
     if (numeric){
         int a = Integer.parseInt(name);
         if (a - 1 >=sG.generateStudent().size()){

             System.out.println("!!! Please type number that you see only !!!");

             Integer counter = 1;
             for (Student student: sG.generateStudent()){
                 System.out.println("{"+counter+"}"+student.getFirstName()+" "+student.getLastName());
                 counter++;
             }
             Scanner scanner = new Scanner(System.in);
             System.out.println("Select a student");
             String newAnswer = scanner.nextLine();
             SelectStudent selectStudent = new SelectStudentHelper();
             selectStudent.selectStudent(newAnswer);
             }
         else{
             System.out.println(sG.generateStudent().get(a-1).getFirstName()+" "+sG.generateStudent().get(a-1).getLastName()+
                     "\n Book That Student Has");
             int counter = 1;
             for (Book book: sG.generateStudent().get(a-1).getBooks()){
                 System.out.println("{"+counter+"}"+book.getBookName());
                 counter++;

             }
             ForAdmin forAdmin = new ForAdminHelper();
             forAdmin.forAdmin();
         }

         }
     else{
         System.out.println("!!!Please type only number !!!");
         Integer counter = 1;
         for (Student student:sG.generateStudent()){
             System.out.println("{"+counter+"}"+student.getFirstName()+" "+student.getLastName());
             counter++;
         }
         Scanner scanner = new Scanner(System.in);
         System.out.println("Select a student");
         String newAnswer = scanner.nextLine();
         SelectStudent selectStudent = new SelectStudentHelper();
         selectStudent.selectStudent(newAnswer);

     }


     }

}
