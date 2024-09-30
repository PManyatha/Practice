package ArrayList;

import java.util.*;

public class Main1{
    public static void main(String[] args){
        List<Student> students=new ArrayList<>();

        students.add(new Student("Manyatha","A"));
        students.add(new Student("Sweeha","B"));
        students.add(new Student("Geetha","C"));
        students.add(new Student("Akashitha","D"));

       students.get(0).setGrade("A+");
        students.get(0).setName("gagana");

        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade());
        }
        System.out.println("\n");
        for(int i = 0;i<students.size();i++){
            Student stud=students.get(i);
            System.out.println("Name: " + stud.getName() + ", Grade: " + stud.getGrade());

        }

        System.out.println("\n");

        Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()){
                Student student=iterator.next();
                System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade());


        }

        // 1. size(): Returns the number of elements in the ArrayList
        System.out.println("Number of students in the list: " + students.size());

        // 2. contains(): Checks if the ArrayList contains the specified element
        // You need to compare the object for checking, so here we create a new Student to check.
        Student checkStudent = new Student("Geetha", "C");
        System.out.println("List contains Geetha (C): " + students.contains(checkStudent)); // This will return false unless you override equals()

        // 3. indexOf(): Returns the index of the first occurrence of the specified element
        System.out.println("Index of Geetha (C): " + students.indexOf(checkStudent)); // Same issue as contains()

        // 4. clear(): Removes all elements from the ArrayList
        System.out.println("Clearing the list...");
        students.clear();
        System.out.println("Number of students after clear(): " + students.size());

        // 5. isEmpty(): Checks if the ArrayList is empty
        System.out.println("Is the list empty? " + students.isEmpty());

        // Adding some students back
        students.add(new Student("Ramya", "A"));
        students.add(new Student("Lakshmi", "B"));

        // 6. toArray(): Returns an array containing all the elements in the ArrayList
        Student[] studentArray = students.toArray(new Student[0]);
        System.out.println("Students in the array:");
        for (Student student : studentArray) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade());
        }
        }

}


class Student{
    String Name;
    String Grade;

    Student(String Name,String Grade){
        this.Name=Name;
        this.Grade=Grade;
    }


    public String getName() {
        return Name;
    }

    public String getGrade() {
        return Grade;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    // You need to override equals() and hashCode() to make contains() and indexOf() work properly with custom objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(Name, student.Name) &&
                Objects.equals(Grade, student.Grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Grade);
    }
}
