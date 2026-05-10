import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");

        Scanner scan = new Scanner(System.in);

        // See Learn the Part for detailed instructions.
        int secret = (int) (5 * Math.random() + 1);

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int guess = 0;
        while (guess != secret) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
            System.out.println(guess);
        }

        System.out.print("You got it!");

        scan.close();
    }

}
