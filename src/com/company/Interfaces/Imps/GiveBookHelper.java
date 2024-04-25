package com.company.Interfaces.Imps;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.GiveBook;
import com.company.Interfaces.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class GiveBookHelper implements GiveBook {
    @Override
    public void giveBook(String answer, List<Student> studentList, List<Book> books) {
        boolean numeric = true;
        numeric = answer.matches("-?\\d+(\\.\\d+)?");
        if (numeric){
            int a = Integer.parseInt(answer);
            if ((a-1)>=studentList.get(studentList.size()-1).books.size()){
                System.out.println("type only number that you see");
                Scanner scanner = new Scanner(System.in);
                int counter = 1;
                for(Book book:studentList.get(studentList.size()-1).books){
                    System.out.println("["+counter+"] "+book.getBookName()+"\n");
                    counter ++;
                }
                System.out.println("Select a book to give");
                String newAnswer = scanner.nextLine();
                giveBook(newAnswer,studentList,books);

            }
            else{
                System.out.println("you gave the "+studentList.get(studentList.size()-1).books.get(a-1).getBookName()+
                        "to back to the library");
                books.add(studentList.get(studentList.size()-1).books.get(a-1));
                studentList.get(studentList.size()-1).books.remove(a-1);
                Scanner scanner = new Scanner(System.in);
                System.out.print("Will you going to take book or give book: \nPress [1] to take book and press [2] to give book.");
                String ans = scanner.nextLine();
                TakeOrGiveBook takeOrGiveBook = new TakeOrGiveBookHelper();
                takeOrGiveBook.takeOrGiveBook(ans,books,studentList);
            }


        }
        else{
            System.out.println("please type only number!!!");
            Scanner scanner = new Scanner(System.in);
            int counter = 1;
            for(Book book:studentList.get(studentList.size()-1).books){
                System.out.println("["+counter+"] "+book.getBookName()+"\n");
                counter ++;
            }
            System.out.println("Type the number of the book: ");
            String ans = scanner.nextLine();
            giveBook(ans, studentList,books);
        }
    }
}
