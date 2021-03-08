import java.util.Random;
import java.util.Scanner;

public class Magic8Balls {
    public static void main (String[] args) {
        System.out.println("Welcome to magic 8 ball! Ask me a question!");
        String[] Answers = { "It is certain.", "It is decidedly so.", "Without a doubt.", "Yes – definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.",
                "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.",
                "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."
        };
        Scanner scan = new Scanner(System.in);
        String question = scan.nextLine();


        while (true) {
            Random randNum = new Random();
            int num = randNum.nextInt(20);
            System.out.println(Answers[num]);
            System.out.println("Do you have any more questions? Say no if you want to exit.");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
