package LibraryManagementSystem;
import java.util.*;
public class Search {

    public void searching(List<Book> books, String author) {
        boolean found = false;
        System.out.println("Searching for books by author: " + author);
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    // Search by book ID
    public void searching(List<Book> books, int id) {
        boolean found = false;
        System.out.println("Searching for book with ID: " + id);
        for (Book book : books) {
            if (book.getBookid() == id) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with ID: " + id);
        }
    }

    }

