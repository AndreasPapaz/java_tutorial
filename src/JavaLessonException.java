import java.util.*;
import java.io.*;

public class JavaLessonException {
    // User Input
//    static Scanner userInput = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        System.out.print("how old are you?");
//        int age = checkValidAge();
//
//        if (age != 0) {
//            System.out.println("you are " + age + " years old");
//        }
//
//    }
//
//    public static int checkValidAge() {
//        try {
//            return userInput.nextInt();
//        }
//        catch (InputMismatchException e) {
//            userInput.next();
//            System.out.print("That is not a whole Number");
//            return 0;
//        }
//    }

    public static void main(String[] args) {
        getAfile("./somestuff.txt");
    }
    // throws will give the caller the void value
    public static void getAfile(String fileName) {
        try {
            FileInputStream file = new FileInputStream(fileName);
        }
        catch (FileNotFoundException e) {
            System.out.println("sorry cannot fild that file");
        }
        catch (IOException e) {
            System.out.println("Unknown IO Error");
        }

        catch (Exception e) {
            System.out.println("Some error occured");
        }
        finally {
            System.out.println("Clean up code");
        }
    }

}
