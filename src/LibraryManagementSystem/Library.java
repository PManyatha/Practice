package LibraryManagementSystem;

import java.util.*;

public class Library {
    static List<Book> book=new ArrayList<>();
    static List<Books> details = new ArrayList<>();
    static List<Magazine> magazine=new ArrayList<>();
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        Search search=new Search();

        book.add(new Book(11,"JAVA","ABC",10));
        book.add(new Book(12,"Python","PQR",6));
        book.add(new Book(13,"Software Testing","XYZ",2));



        magazine.add(new Magazine("DEF",13,678));

        User user=new User("111","Priya");
        int choice;
        do{
            System.out.println("\n Library Management System:");
            System.out.println("1. Search Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Add a New Book");
            System.out.println("4. Display Details of Books");
            System.out.println("5. Display Details of Magazine");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();


        switch (choice){
            case 1:System.out.println("1.Search by Author \n 2.Search by ID");
                   int option=scanner.nextInt();
                   if(option==1){
                     search.searching(book,"ABC");
                   }
                   if(option==2) {
                       search.searching(book, 12);
                   }
                   break;

            case 2:System.out.println("Enter a BookId to borrow");
                   int id=scanner.nextInt();

                   for(Book books:book){
                       if(books.getBookid()==id && books.getNumberOfBooks()!=0){
                           System.out.println("Book Borrowed Successfully!!");
                       }
                       else{
                           System.out.println("Book not found");
                       }
                   }
                   break;

            case 3:System.out.println("The details to add new books");
                   book.add(new Book(13,"Automation","IJK",1));
                   break;
                   
        }
        }while(choice!=6);
    }
}






