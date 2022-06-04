import java.util.Arrays;

public class morningWarmup {
    public static void main(String[] args) {
//        Create a function that takes the age in years and returns the age in days.
//                example input: 65
//        expected output: 23725
//        2. Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.
//                example inputs: 4, '/', 2
//        expected output: 2 (edited)
        numbers("one");
    }

    public static String numbers(String numbers) {
//        input = "1 2 3 4 5";
//        System.out.println(input);
        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }

//       return input;
        }




//    Create a method that accepts a string of space separated numbers and
//    returns the highest and lowest number (as a string).
//        example input: "1 2 3 4 5"
//        expected output: "5 1"
//        example input: "1 9 3 4 -5"
//        expected output: "-5 9"