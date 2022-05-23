import java.util.Arrays;

public class arrLecture {
        public static void main(String[] args) {
                String[] texasTemp = new String[3];

                texasTemp[0] = "sunny";
                texasTemp[1] = "cloudy";
                texasTemp[2] = "raining";
                System.out.println(texasTemp[0]);

                long[] dailySteps = {6000, 8000, 9000, 10000};
                System.out.println(Arrays.toString(dailySteps));
////////**************************************************************//////////
                //Let's create a method that returns the sum of all integers in an int array (nums)

                //      1.what data type will be returned from this method?
                //      2.what method signature is required for this?
                //      3.where does this method live?
                //      4.what’s the data type of our array?
                //      5.how many elements should our array have?
                //      6.how are we going to initialize it?
                //        a.initializer syntax (array literal)
                //        b.array declaration
                //      variable to store the sum as we iterate through the array of numbers
                //        a.where does this variable go?
                int[] array = {1, 2, 3, 4};
                int sum = 0;
                for (int i : array) {
                        sum += i;
                }

                System.out.println(sum);

                String[] languages = {"french", "chinese", "italian"};
                String[] fluentIn = {"french", "spanish", "japanese"};
                System.out.println(Arrays.equals(languages, fluentIn));

                //        TODO: iterate through the 2D array and print out every number
                //        things to think about:
                //        ? what data type is the enhanced for looking for? --> array
                //        ?
                int[][] myMatrix =
                        {
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9},
                        };
                //myMatrix holds total of 3 elements
                //each element is datatype: array of int
                //each element (int[]) has 3 elements
                //each element inside of each int[] is datatype: int
                // for(dataType variableName: nameOfArray){
                //access to each variable
                //}

                for(int[]innerArr: myMatrix){
                        System.out.println(Arrays.toString(innerArr));

                        //inner for loop to access elements inside of each arrayint
                        for(int eachEl: innerArr){
                                System.out.println((eachEl));
                        }
                }
        }}

