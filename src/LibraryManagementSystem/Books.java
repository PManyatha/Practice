package LibraryManagementSystem;

import java.util.*;

public class Books extends Details{
    List<Book> book=new ArrayList<>();
    Book author;
    Book id;
    Book numberofBooks;

    public Books(Book author,Book id,Book numberofBooks) {
        this.author =author ;
        this.id=id;
        this.numberofBooks=numberofBooks;
    }

    @Override
    void detailsOfBooks(String author, int id, int pages) {
        System.out.println("The Details Of the Book is:");
        System.out.println("Book ID:"+id+"Author Name:"+author+"Pages:"+pages);

    }
}
