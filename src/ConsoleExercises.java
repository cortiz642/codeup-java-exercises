import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //*****************************Q1***********************************//
        double pi = 3.14159;
        double almostPi = (int) pi;
        String name = "The value of pi is approximately";
        System.out.printf("%s,%s", name, almostPi);
        //*****************************Q1***********************************//

        //*********************EXPLORE SCANNER CLASS************************//
        //*****************************Q1***********************************//
        //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        //
        //What happens if you input something that is not an integer?
        System.out.print("\n Enter something: ");
        int userInput = scanner.nextInt();
        System.out.println(" You entered: --> \"" + userInput + "\" <--");
        //*****************************Q1***********************************//

        //*****************************Q2***********************************//
        //Prompt a user to enter 3 words, and store each of them in a separate
        // variable. Then, display them back in the console, each on a newline.
        //

        System.out.println("Please enter 3 words?");
        String userWord1 = scanner.next();
        System.out.println("You entered:\"" + userWord1 + "\"");
        String userWord2 = scanner.next();
        System.out.println("You entered:\"" + userWord2 + "\"");
        String userWord3 = scanner.next();
        System.out.println("You entered:\"" + userWord3 + "\"");
        //What happens if you enter less than 3 words?
        //What happens if you enter more than 3 words?
        //*****************************Q2***********************************//

        //*****************************Q3***********************************//
        //Prompt a user to enter a sentence, then store that sentence in a String
        // variable using the next method. Then, display that sentence back to the user.
        //
//        System.out.println("Please enter a sentence?");
//        String userSentence = scanner.next();
//        System.out.println("You entered:\"" + userSentence + "\"");
        //do you capture all the words? No
        //*****************************Q3***********************************//

        //*****************************Q4***********************************//
        //Rewrite the above example using the nextLine method.
        System.out.println("Please enter a sentence?");
        String userSentence = scanner.nextLine();
        System.out.println("You entered:\"" + userSentence + "\"");
        //*****************************Q4***********************************//

        //*****Calculate the perimeter and area of Codeup's classrooms*****//
        //*****************************Q1***********************************//
        //Prompt the user to enter values of length and width of a classroom at
        // Codeup (or your room if virtual).
        //
        //Use the nextLine method each time you need to get user input.
        // In this case, we need it twice, once to get the user input for the
        // length and again to get the user input for the width. Parse the
        // resulting strings to a numeric type.
        //
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.

        System.out.println("Please enter length and width values of a room?");
        System.out.println("What is the length of you room?");
        int roomLength = scanner.nextInt();
        System.out.println("What is the width of your room?");
        int roomWidth = scanner.nextInt();
//        public static int parseInt(String s);

        //*****************************Q1***********************************//

    }
}
