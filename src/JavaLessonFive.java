import java.util.Scanner;

public class JavaLessonFive {

    static int randomdNumber;
    static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println(getRandomdNumber());

        int guessRestult = 1;
        int randomGuess = 0;

        while (guessRestult != -1) {
            System.out.print("Guess a number between 0 & 50.");

            randomGuess = userInput.nextInt();
            guessRestult = guessRandom(randomGuess);
        }
        System.out.println("Yes you found the rando : " + randomdNumber);
    }

    public static int getRandomdNumber() {
        randomdNumber = (int) (Math.random() * 51);
        return randomdNumber;
    }

    public static int guessRandom(int guess) {
        if (guess == randomdNumber) {
            return -1;
        } else {
            return guess;
        }
    }

}
