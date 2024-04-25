package com.company.Interfaces.Imps;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.GiveBook;
import com.company.Interfaces.SelectBook;
import com.company.Interfaces.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class TakeOrGiveBookHelper implements TakeOrGiveBook {


    @Override
    public void takeOrGiveBook(String answer, List<Book> allBooks, List<Student> students) {
        if (answer.equals("1")){
            if (allBooks.size()==0){
                System.out.println("There is no book to take. Please give some of your book.");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Will you take or give a book ");
                String newAns = scanner.nextLine();
                takeOrGiveBook(newAns , allBooks , students);

            }
            else{
                System.out.println("All books: \n ");
                Integer counter = 1;
                for (Book book : allBooks){
                    System.out.println("["+counter+"] "+book.getBookName()+" by "+book.getAuthor()+" "+"\nPage number "+book.getPaperNumber()+"\n");
                    counter++;
                }
                Scanner newAnswer = new Scanner(System.in);
                System.out.println("Choose a book ");
                String ans = newAnswer.nextLine();
                SelectBook selectBook = new SelectBookHelper();
                selectBook.selectBook(ans,students,allBooks);
            }

        }
        if (answer.equals("2")) {
            if (students.get(students.size() - 1).books.size() == 0) {
                System.out.println("You don't have any book");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Will you take a book or give book");
                String newAnswer = scanner.nextLine();
                takeOrGiveBook(newAnswer, allBooks, students);

            } else {
                System.out.println("You have these books");
                int counter = 1;
                for (Book book : students.get(students.size() - 1).books) {
                    System.out.println("{" + counter + "}" + book.getBookName() + "\n");
                    counter++;
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Select a book to give ");
                String newAnswer = scanner.nextLine();
                GiveBook giveBook = new GiveBookHelper();
                giveBook.giveBook(newAnswer, students, allBooks);
            }
        }
        else{
            System.out.println("wrong. type again");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Take or give book?");
            String newAnswer = scanner.nextLine();
            takeOrGiveBook(newAnswer,allBooks,students);
        }

    }
}
