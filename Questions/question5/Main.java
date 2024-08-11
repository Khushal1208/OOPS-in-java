package OOPS.Questions.question5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        Book.add_book(book1);
        Book.add_book(book2);

        //creating varaible of arryalist of booktype
        ArrayList <Book> books = Book.getBookCollection();
        System.out.println("List of books:");
        for(Book book:books){
            System.out.println(book.getTitle()+"by"+book.getAuthor()+",ISBN"+book.getISBN());
        }
        Book.remove_book(book1);
        System.out.println("\nAfter removing " + book1.getTitle() + ":");
        System.out.println("List of books:");
        for (Book book: books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}
