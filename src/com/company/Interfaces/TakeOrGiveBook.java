package com.company.Interfaces;

import com.company.Classes.Book;
import com.company.Classes.Student;

import java.util.List;

public interface TakeOrGiveBook {
    void takeOrGiveBook(String answer, List<Book> allBooks, List<Student> students);

}
