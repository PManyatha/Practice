package LibraryManagementSystem;

public class Borrow {

    private User user;
    private Book book;

    public Borrow(User user, Book book) {
        this.user = user;
        this.book = book;
    }

    public void borrowBook() {
        if (book.getNumberOfBooks() > 0) {
            book.setNumberOfBooks(book.getNumberOfBooks() - 1);
            System.out.println("User " + user.getName() + " (Reg No: " + user.getRegno() + ") borrowed " + book.getBookname());
            System.out.println("Remaining copies of " + book.getBookname() + ": " + book.getNumberOfBooks());
        } else {
            System.out.println("Sorry, " + book.getBookname() + " is not available for borrowing.");
        }
    }
}
