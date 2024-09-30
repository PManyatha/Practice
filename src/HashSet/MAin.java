package HashSet;

import java.util.*;

public class MAin {
    public static void main(String [] args){
    List<String> names = Arrays.asList("John", "Alice", "Bob", "John", "Alice");
    HashSet<String> uniqueNames = new HashSet<>(names);
    System.out.println("Unique names: " + uniqueNames);

        HashSet<Integer> userIDs = new HashSet<>();
        userIDs.add(1001);
        userIDs.add(1002);
        userIDs.add(1003);

        int userIDToCheck = 1002;
        if (userIDs.contains(userIDToCheck)) {
            System.out.println("User ID " + userIDToCheck + " exists.");
        }

}
}