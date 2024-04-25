package com.company.Interfaces.Imps;

import com.company.Classes.Student;
import com.company.Interfaces.ForAdmin;
import com.company.Interfaces.GenerateStudent;
import com.company.Interfaces.SelectStudent;

import java.util.List;
import java.util.Scanner;

public class ForAdminHelper implements ForAdmin {
    @Override
    public void forAdmin() {
        GenerateStudent generateStudent = new GenerateStudentHelper();
        List<Student> students = generateStudent.generateStudent();
        System.out.println("All Student: ");
        Integer counter = 1;
        for (Student allStudent : students){
            System.out.println("{"+counter+"}"+allStudent.getFirstName()+" "+allStudent.getLastName()+" \n" +
                    "phone number; "+allStudent.getPhoneNumber()+"\n");
            counter++;

            }
        Scanner scanner = new Scanner(System.in);
        System.out.println("select student");
        SelectStudent selectStudent = new SelectStudentHelper();
        String studentNo = scanner.nextLine();
        selectStudent.selectStudent(studentNo);

        }
    }

