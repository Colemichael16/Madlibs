
import java.util.Scanner; // import the Scanner class

public class Madlibs {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please Enter Your Name");
        String Name = userInput.nextLine();
        System.out.println("Welcome" + Name + "Fill out everything to create some cool madlibs!!");
        System.out.println("Please enter a noun?");
        String noun1 = userInput.nextLine();
        System.out.println("Your noun is" + noun1 +"");
        System.out.println("Thank you. Now, enter a verb.");
        String verb1 = userInput.nextLine();
        System.out.println("Your verb is" + verb1 +"");
        System.out.println("You are a spelunker and your name is David.  You like " + noun1 +". But you always run into "+verb1);  // Output user input
    }
}
