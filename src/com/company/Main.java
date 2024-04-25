package com.company;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.*;
import com.company.Interfaces.Imps.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who Are You ? ");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.equals("student")) {
            ForStudent forStudent = new ForStudentHelper();
            forStudent.forStudent();
        }
        else if (answer.equals("admin")) {
            ForAdmin forAdmin = new ForAdminHelper();
            forAdmin.forAdmin();


        }
        else  {

            ForFalseAnswer forFalseAnswer = new ForFalseHelperAnswer();
            forFalseAnswer.falseAnswer(answer);


            }
        }


    }