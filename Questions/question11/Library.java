package OOPS.Questions.question11;
//Write a Java program to create a class called "Library" with
//a collection of books and methods to add and remove books.
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books ;
    public Library(){
        books = new ArrayList<Book>();
    }
    public  void addBook(Book book){
        books.add(book);
    }
    public  void removeBook(Book book){
        books.remove(book);
    }
    public ArrayList<Book> getBook(){
        return books;
    }

}
