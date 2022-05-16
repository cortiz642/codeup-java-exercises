import javax.swing.*;

//public class HelloWorld {
//    public static void main(String[] args) {
////        System.out.println("Hello, World!");
//          System.out.print("Hello, World!");
//          System.out.print("Hello, \"\t\n\rChris\" World!");
//
//    }


    /*
    *this is a JTable
    *1.something
    *2.however
    *3.naming
     */
//}
//Exercises Syntax,Types,and Variables q1-4
public class HelloWorld { //line:20 assigns a class of HelloWorld
    public static void main(String[] args) { //
    int myFavoriteNumber = 9;
    System.out.println(myFavoriteNumber);
//    String myString = "Java";
//    System.out.println('myString');
        String myString = "3.14159";
        System.out.println(myString);
        //******************************************************************//
        //**Q5.Declare an long variable named myNumber, but do not assign anything
        // to it. Next try to print out myNumber to the console. What happens?**
        //******************************************************************//

        //Shows variable "myNumber" is not initialized meaning "myNumber variable
        //needs a value in order to run
//        long myNumber;
//        System.out.println(myNumber);

        //******************************************************************//
        //Q6.Change your code to assign the value 3.14 to myNumber. What do you notice?
        //******************************************************************//
        //Will not run because it is assigned the incorrect "Data Type" should
        //be "double" instead of "long"
//        long myNumber = 3.14;
//        System.out.println(myNumber);

        //******************************************************************//
        //Q7.Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        //******************************************************************//
        //Prints out 123 without the L
        //The "L" is a suffix which tells the compiler that we have a long number literal
//        long myNumber = 123L;
//        System.out.println(myNumber);

        //******************************************************************//
        //Q8.Change your code to assign the value 123 to myNumber.
        //
        //Why does assigning the value 3.14 to a variable declared as a long
        // not compile, but assigning an integer value does?
        //******************************************************************//
        //Prints out 123
        /*long myNumber = 123;*/
//        System.out.println(myNumber);

        //******************************************************************//
        //Q9.Change your code to declare myNumber as a float. Assign the value
        // 3.14 to it. What happens? What are two ways we could fix this?
        //******************************************************************//

        //******************************************************************//
        //******************************************************************//
    }
}
