import java.util.Scanner;

public class Magic8Balls {
    public static void main (String[] args) {
        String[] Answers = {"Yes", "No", "Try again later", "Very Doubtful", "Better not tell you now", "Yes - %100", "Don't count on it", "Without a doubt"};
        Scanner scan = new Scanner(System.in);
        String question = scan.nextLine();
        Random randNum = new Random();
    }
}
