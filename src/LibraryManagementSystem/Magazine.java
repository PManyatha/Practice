package LibraryManagementSystem;

public class Magazine extends Details{
    String author;
    int id;
    int pages;

    public Magazine(String author,int id,int pages) {
        this.author = author;
        this.id=id;
        this.pages=pages;
    }

    @Override
    void detailsOfBooks(String author, int id, int pages) {
        System.out.println("The Details Of the Book is:");
        System.out.println("Book ID:"+id+"Author Name:"+author+"Pages:"+pages);

    }
}
