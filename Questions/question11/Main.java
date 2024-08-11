package OOPS.Questions.question11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Adventures of Tom Sawyer", "Mark Twain");
        Book book2 = new Book("Ben Hur", "Lewis Wallace");
        Book book3 = new Book("Time Machine", "H.G. Wells");
        Book book4 = new Book("Anna Karenina", "Leo Tolstoy");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        ArrayList<Book> books = library.getBook();

        for(Book book:books){
            book.printBookDetails();
        }
        books.remove(book3);
        books.remove(book2);
        System.out.println("\nBooks in the library after removing " + book2.getName() + ":");
        for(Book book:books){
            book.printBookDetails();
        }

    }
}
