import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class ConsoleExercises {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//System.out.print("Enter something: ");
//    String userInput = scanner.nextLine();
//
//System.out.println("You entered: --> \"" + userInput + "\" <--");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        double almostPi = (int) pi;
//        String name = "The value of pi is approximately";
//        System.out.printf("%s,%s", name,almostPi);
//        System.out.print("\n Enter something: ");
//        int userInput = scanner.nextInt();
//        System.out.println(" You entered: --> \"" + userInput + "\" <--");
//        for(int i = 1; i <= 10; i++) { // <--+
//            if(i % 2 == 1) { //              |
//                continue; // ----------------+
//            }
//            System.out.println(i);
//        }
//
        String message = "Hello";
//        System.out.println(message); // prints "Hello"
        message = message + " World!";
        System.out.println(message); // prints "Hello, World!"
    }
}
