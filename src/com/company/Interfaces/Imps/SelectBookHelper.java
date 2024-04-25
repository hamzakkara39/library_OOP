package com.company.Interfaces.Imps;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.SelectBook;
import com.company.Interfaces.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;
public class SelectBookHelper implements SelectBook {

    @Override
    public void selectBook(String answer, List<Student> students, List<Book> books) {
        boolean numeric = true;
        numeric = answer.matches("-?\\d+(\\.\\d+)?");
        if (numeric){
            int a = Integer.parseInt(answer);
            if (a-1>=books.size()){
                System.out.println("!!!type the number only you see!!!");
                Scanner scanner = new Scanner(System.in);
                int counter= 1;
                for (Book book: books){
                    System.out.println("["+counter+"] "+book.getBookName()+" by "+book.getAuthor()+"\n");
                    counter++;
                }
                System.out.println("Select a book");
                String newAnswer = scanner.nextLine();
                selectBook(newAnswer,students,books);
            }
            else{
                System.out.println("You chose: "+books.get(a-1).getBookName());
                students.get(students.size()-1).books.add(books.get(a-1));
                books.remove(a-1);

                Scanner scanner = new Scanner(System.in);
                System.out.println("will you take or give book");
                String newAnswer = scanner.nextLine();
                TakeOrGiveBook takeOrGiveBook = new TakeOrGiveBookHelper();
                takeOrGiveBook.takeOrGiveBook(newAnswer,books,students);
            }

        }
        else{
            System.out.println("please type only number!!!");
            Scanner scanner = new Scanner(System.in);
            int counter= 1;
            for (Book book: books){
                System.out.println("["+counter+"] "+book.getBookName()+" by "+book.getAuthor()+"\n");
                counter++;
            }
            System.out.println("Select a book");
            String newAnswer = scanner.nextLine();
            selectBook(newAnswer,students,books);
            }
    }
}

