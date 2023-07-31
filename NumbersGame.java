import java.util.Random;
import java.util.Scanner;

public class NumbersGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, human. I am thinking of a number between 0 and 10.");
        System.out.println("*********************************************************");
        System.out.println("Can you guess the number?");
        System.out.println("If you are not up to the task, you can always type 'q' to quit.");
        while (true) {
            int answer = new Random().nextInt(10);
            String guess = scanner.nextLine();
            if (guess.equals("q")) {
                System.out.println("I knew you didn't have it in you.");
                System.out.println("Shutting down...");
                break;
            }
            try {
                if (Integer.parseInt(guess) == answer) {
                    System.out.println("Lucky guess! But can you do it again?");
                } else {
                    System.out.println("Swing and a miss! Keep trying...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 0 and 9 or 'q' to quit.");
            }
        }
        System.out.println("Game over. Shutting down...");
        scanner.close();
    }
}