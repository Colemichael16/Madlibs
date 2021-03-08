
import java.util.Scanner; // import the Scanner class

public class Madlibs {
    public static void main(String[] args) throws InterruptedException {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please Enter Your Name");
        String Name = userInput.nextLine();
        System.out.println("Welcome " + Name + "! Fill out everything to create some cool madlibs!!");
        System.out.println("Please enter a verb?");
        String verb2 = userInput.nextLine();
        System.out.println("Your verb is " + verb2 +". ");
        System.out.println("Thank you. Now, enter another verb.");
        String verb1 = userInput.nextLine();
        System.out.println("Your verb is " + verb1 + ". ");
        System.out.println("Enter something you do for fun");
        String fun = userInput.nextLine();
        System.out.println("You like to do " + fun + ". For fun");
        System.out.println("Tell me a cool place!");
        String Place = userInput.nextLine();
        System.out.println(" "+ Place + " sounds pretty cool!");
        System.out.println("Tell me a noun!");
        String Noun = userInput.nextLine();
        System.out.println("Your noun is " + Noun +"");
        System.out.println("Now tell me an adjective");
        String Adjective = userInput.nextLine();
        System.out.println("Your adjective is " + Adjective + "");
        System.out.println("Tell me a noun!");
        String Noun3 = userInput.nextLine();
        System.out.println("Your noun is " +Noun3+"");
        System.out.println("Now generating madlibs give us a few moments.");
        Thread.sleep(5000);
        System.out.println("Your name is " + Name + ". You are currently at a " + Place + " doing " + fun + " You suddenly see a dog lying on the floor so you " + verb1 + " the dog. The dog then gets really angry and decides to bite you! So you " + verb2 + " the dog, it runs away scared. You then head over to see " + Noun + ". While heading there you start to feel " + Adjective + " Then suddenly you turn into a " +Noun3+ ". You then start to scream. And then you wake up, everything was a dream. You are relieved and you go back to bed. The End. Thank you for playing " +Name+ ".");  // Output user input
    }
}
