import java.util.Scanner;

public class JavaLessonTwo {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Your d Number: ");

        if (userInput.hasNextInt()) {
            // we do a type check form the Scanner API
            // && we get the `next"dataType"`
            int numberEntered = userInput.nextInt();
            System.out.println("You entered : " + numberEntered);

            int numberABS = Math.abs(numberEntered);


        } else {
            System.out.println("Enter an int next time!");
        }

    }

}
