
import java.util.Scanner; // import the Scanner class

public class Madlibs {
    public static void main(String[] args) {
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
        System.out.println("Your adjective is" + Adjective + "");

        System.out.println("Your name is " + Name + ". You are currently at a " + Place + " doing " + fun + " You suddenly see a dog lying on the floor so you " + verb1 + " the dog. The dog then gets really angry and decides to bite you! So you " + verb2 + " the dog, it runs away scared. You then head over to see " + Noun + " .While headding there you start to feel " + Adjective + "");  // Output user input
    }
}
