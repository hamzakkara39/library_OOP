package com.company.Interfaces.Imps;

import com.company.Classes.Book;
import com.company.Interfaces.GenerateBook;

import java.util.ArrayList;
import java.util.List;

public class GenerateBookHelper implements GenerateBook {

    @Override
    public List<Book> generateBook() {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        Book book6 = new Book();
        Book book7 = new Book();
        Book book8 = new Book();
        Book book9 = new Book();
        Book book10 = new Book();

        book1.setBookName("Asi Ve Guzel");
        book1.setAuthor("Candace Camp");
        book1.setPaperNumber(507);
        books.add(book1);

        book2.setBookName("Serena");
        book2.setAuthor("Ron Rash");
        book2.setPaperNumber(602);
        books.add(book2);

        book3.setBookName("Ters Yuz");
        book3.setAuthor("Lauren Dane");
        book3.setPaperNumber(236);
        books.add(book3);

        book4.setBookName("Ask Tutulmasi");
        book4.setAuthor("Feza Breeze");
        book4.setPaperNumber(357);
        books.add(book4);

        book5.setBookName("Leyla Ile Mecnun");
        book5.setAuthor("Fuzuli");
        book5.setPaperNumber(450);
        books.add(book5);

        book6.setBookName("Ask Satar");
        book6.setAuthor("Sebnem Burcuoglu");
        book6.setPaperNumber(230);
        books.add(book6);

        book7.setBookName("Arter");
        book7.setAuthor("Cemal Avci");
        book7.setPaperNumber(460);
        books.add(book7);

        book8.setBookName("Asansor");
        book8.setAuthor("Beyza Alkoc");
        book8.setPaperNumber(807);
        books.add(book8);

        book9.setBookName("Bana Ikimizi Anlar");
        book9.setAuthor("Ahmet Batman");
        book9.setPaperNumber(280);
        books.add(book9);

        book10.setBookName("Serseri");
        book10.setAuthor("Ebru Ozer");
        book10.setPaperNumber(560);
        books.add(book10);





        return books;
    }
}
