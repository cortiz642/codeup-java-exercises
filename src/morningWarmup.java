import java.util.Scanner;
import java.util.stream.IntStream;

public class morningWarmup<i> {
    public static void main(String[] args) {
//        Create a function that takes the age in years and returns the age in days.
//                example input: 65
//        expected output: 23725
//        2. Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.
//                example inputs: 4, '/', 2
//        expected output: 2 (edited)
//        numbers("one");
//    }
//
//    public static String numbers(String numbers) {
////        input = "1 2 3 4 5";
////        System.out.println(input);
//        int min = Arrays.stream(numbers.split(" "))
//                .mapToInt(i -> Integer.parseInt(i))
//                .min()
//                .getAsInt();
//
//        int max = Arrays.stream(numbers.split(" "))
//                .mapToInt(i -> Integer.parseInt(i))
//                .max()
//                .getAsInt();
//
//        return String.format("%d %d", max, min);
//    }

//       return input;


//////******************************FIZZBUZZ******************************////////
//    Warmup: Write a function that prints the numbers 1 - 100 unless the number
//    is divisible by 3, 5 or both 3 and 5. If divisible by 3 print "Fizz" . If
//    divisible by 5 print "Buzz". If divisible by both 3 and 5 print "FizzBuzz"
//constructor of the scanner class


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        //reads an integer from the user
        int n = sc.nextInt();
        System.out.println("The Fizz, Buzz, and FizzBuzz numbers are: ");
//for loop executes until the condition i<=n becomes false
        for (int i = 1; i <= 100; i++) {
//returns true if both the conditions return true
            if (i % 3 == 0 && i % 5 == 0) {
//prints if the number is multiple of 3 and 5
                System.out.print("FizzBuzz");
            }
//executes if the condition returns true
            else if (i % 3 == 0) {
//prints if the number is multiple of 3
                System.out.print("Fizz");
            }
//executes if the condition returns true
            else if (i % 5 == 0) {
//prints if the number is multiple of 5
                System.out.print("Buzz");
            } else {
//prints the number itself if the number is not divisible by both 3 and 5
                System.out.print(i);
            }
//prints space
            System.out.print("," + " ");
        }
//        close the Scanner
        sc.close();
    }
}





//    Create a method that accepts a string of space separated numbers and
//    returns the highest and lowest number (as a string).
//        example input: "1 2 3 4 5"
//        expected output: "5 1"
//        example input: "1 9 3 4 -5"
//        expected output: "-5 9"