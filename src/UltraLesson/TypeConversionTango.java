package UltraLesson;

public class TypeConversionTango {
    public static void main(String [] args){
        double myDouble = 9.99;
        int myInt = 25;


        int convertedInt = (int) myDouble;
        double convertedDouble = myInt;

        // Step 5: Print the converted values
        System.out.println("Converted double to int: " + convertedInt);
        System.out.println("Converted int to double: " + convertedDouble);

    }
}
