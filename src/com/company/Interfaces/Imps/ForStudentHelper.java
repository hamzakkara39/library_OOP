package com.company.Interfaces.Imps;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.ForStudent;
import com.company.Interfaces.GenerateBook;
import com.company.Interfaces.GenerateStudent;
import com.company.Interfaces.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class ForStudentHelper implements ForStudent {
    @Override
    public void forStudent() {
        GenerateBook generateBooks = new GenerateBookHelper();
        List<Book> allBooks = generateBooks.generateBook();
        GenerateStudent generateStudent = new GenerateStudentHelper();
        List<Student> studentList = generateStudent.generateStudent();

        Student student = new Student();
        Scanner infos = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = infos.nextLine();
        student.setFirstName(name);
        System.out.println("what is your surname: ");
        String surName = infos.nextLine();
        student.setLastName(surName);
        System.out.println("what is your phone number: ");
        String phoneNumber = infos.nextLine();
        student.setPhoneNumber(phoneNumber);
        studentList.add(student);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Will you going to take book or give book: \n Press[1] to take book and press[2] to give book ");
        String answer = scanner.nextLine();
        TakeOrGiveBook takeOrGiveBook = new TakeOrGiveBookHelper();
        takeOrGiveBook.takeOrGiveBook(answer, allBooks,studentList );
    }
}
