package com.company.Interfaces;

import com.company.Classes.Book;
import com.company.Classes.Student;

import java.util.List;

public interface GiveBook {
    void giveBook(String answer, List<Student> students, List<Book> books);
}
