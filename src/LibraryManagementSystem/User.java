package LibraryManagementSystem;

public class User {
    String regno;
    String name;

    public User(String regno,String name){
        this.regno=regno;
        this.name = name;
    }

    public String getRegno() {
        return regno;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return "User ID: " + regno + ", Name: " + name;
    }
}
