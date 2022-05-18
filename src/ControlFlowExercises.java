import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) { // <--+
//            if (i % 2 == 1) { //              |
//                continue; // ----------------+
//            }
//            System.out.println(i);
//        }
        //*****************************Q1.a***********************************//
        //Loop Basics
        //
        //While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//
//        }
        //*****************************Q1.a***********************************//

        //*****************************Q1.b***********************************//
        //Do While
        //
        //Create a do-while loop that will count by 2's starting with 0 and
        // ending at 100. Follow each number with a new line.
        //Alter your loop to count backwards by 5's from 100 to -10.
        //Create a do-while loop that starts at 2, and displays the number
        // squared on each line while the number is less than 1,000,000. Output
        // should equal:

        int i = 0;

        do{
            System.out.println(i % 2 = 1);
            i++;
        }while (i <= 100);


        //*****************************Q1.b***********************************//
    }
}
