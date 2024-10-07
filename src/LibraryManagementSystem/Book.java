package LibraryManagementSystem;

public class Book {
    int bookid;
    String bookname;
    String author;
    int numberOfBooks;

    public Book(int bookid,String bookname,String author,int numberOfBooks) {
        this.bookid = bookid;
        this.author = author;
        this.bookname = bookname;
        this.numberOfBooks = numberOfBooks;
    }

    public int getBookid() {
        return bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }
    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
    public String toString() {
        return "Book ID: " + bookid + ", Name: " + bookname + ", Author: " + author + ", Available Copies: " + numberOfBooks;
    }
}
