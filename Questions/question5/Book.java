package OOPS.Questions.question5;

import java.util.ArrayList;

//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN,
// and methods to add and remove books from a collection.
public class Book {
   private String title , author , ISBN;
   private static ArrayList <Book> bookCollection = new ArrayList<Book>();


    public Book(String title,String author,String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static ArrayList<Book> getBookCollection() {
        return bookCollection;
    }
    public static void add_book(Book book){
        bookCollection.add(book);
    }
    public static void remove_book( Book book){
        bookCollection.remove(book);
    }

}
