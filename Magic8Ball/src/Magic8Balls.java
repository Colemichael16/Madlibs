import java.util.Random;
import java.util.Scanner;

public class Magic8Balls {
    public static void main (String[] args) {
        String[] Answers = {"Yes", "No", "Try again later", "Very Doubtful", "Better not tell you now", "Yes - %100", "Don't count on it", "Without a doubt"};
        Scanner scan = new Scanner(System.in);
        String question = scan.nextLine();


        while (true) {
            Random randNum = new Random();
            int num = randNum.nextInt(20);

            System.out.println("Do you have any questions? Type yes or no.");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
