package com.company.Interfaces.Imps;

import com.company.Classes.Student;
import com.company.Interfaces.GenerateBook;
import com.company.Interfaces.GenerateStudent;

import java.util.ArrayList;
import java.util.List;

public class GenerateStudentHelper implements GenerateStudent {

    @Override
    public List<Student> generateStudent() {
        List<Student> students = new ArrayList<>();
        GenerateBook generateBook = new GenerateBookHelper();


        Student student1 = new Student();
        Student student2 = new Student();

        student1.setFirstName("Hamza");
        student1.setLastName("Akkara");
        student1.setPhoneNumber("0709089183");
        student1.books.add(generateBook.generateBook().get(0));
        student1.books.add(generateBook.generateBook().get(1));
        students.add(student1);

        student2.setFirstName("Ahmet");
        student2.setLastName("Kozal");
        student2.setPhoneNumber("0704087185");
        student2.books.add(generateBook.generateBook().get(4));
        student2.books.add(generateBook.generateBook().get(3));
        students.add(student2);

        return students;
    }
}
