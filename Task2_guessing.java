import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the range of guessing");
        int range = in.nextInt();
        int random = (int)(Math.random()*range);
        int attempts = 0;

        while (true) {
            System.out.println("Guess the number");
            double guess = in.nextDouble();
            attempts++;

            if (guess > random) {
                System.out.println("This number is higher than the one chosen");
            } else if (guess < random) {
                System.out.println("This number is lower than the one chosen");
            } else {
                System.out.println("Correct!");
                break;
            }
        }
        System.out.println("You won after " + attempts + " attempts");
    }
}