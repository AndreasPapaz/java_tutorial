import java.util.Scanner;

public class JavaLessonFour {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int k = 10;

        do {
            System.out.println(k);
            k++;
        } while (k < 10);


        int m, n;

        for (m=1, n=2; m <= 9; m+=2) {
            System.out.println(m + "\n" + n);
        }
    }
}
