import java.util.Arrays;

public class ArraysExercises {
    //Create a class inside of src named ArraysExercises. Create a main
    // method for this class to do your work.
    //What happens when you run the following code? Why is Arrays.toString necessary?
    //When running without adding ".toString method" you will get an error because
    //the array needs to be converted to a string
    public static void main(String[]args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

    //Create an array that holds 3 Person objects. Assign a new instance of
        // the Person class to each element. Iterate through the array and print
        // out the name of each person in the array.

        String[] Person = new String[3];//Array holds 3 Person objects

        //Assigned new instance of the Person class to each element.
//       Person = new String[3];
        Person[0]="juan";
        Person[1]="julio";
        Person[2]="carl";

        //Iterated through the array
        for(String perObj: Person){
        //Prints out name of each person within the array
            System.out.println(perObj);
        }

    //Create a static method named addPerson. It should accept an array of
        // Person objects, as well as a single person object to add to the
        // passed array. It should return an array whose length is 1 greater
        // than the passed array, with the passed person object at the end of
        // the array.

        //created static method named addPerson
//        static String addPerson(String[] Person= new String[0]);

        //
    }
}
