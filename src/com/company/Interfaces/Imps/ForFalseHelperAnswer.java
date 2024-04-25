package com.company.Interfaces.Imps;

import com.company.Classes.Student;
import com.company.Interfaces.ForAdmin;
import com.company.Interfaces.ForFalseAnswer;
import com.company.Interfaces.ForStudent;

import java.util.List;
import java.util.Scanner;

public class ForFalseHelperAnswer implements ForFalseAnswer {

    @Override
    public void falseAnswer(String answer1) {

        while (!answer1.equals("student") && !answer1.equals("admin")) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Type student or admin only");
            String newAnswer = scanner1.nextLine().toLowerCase();
            new ForFalseHelperAnswer().falseAnswer(newAnswer);


            if (newAnswer.equals("student")) {
                ForStudent forStudent = new ForStudentHelper();
                forStudent.forStudent();
                break;

            }
            if (newAnswer.equals("admin")) {
                ForAdmin forAdmin = new ForAdminHelper();
                forAdmin.forAdmin();
                break;


            }


        }
    }
}


