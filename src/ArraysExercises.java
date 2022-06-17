import java.util.Arrays;

public class ArraysExercises {

    //What happens when you run the following code? Why is Arrays.toString necessary?
    //When running without adding ".toString method" you will get an error because
    //the array needs to be converted to a string
    public static Person[] addPerson(Person[]people, Person person){
        Person[] newPersons = Arrays.copyOf(people, people.length + 1);
        newPersons[newPersons.length -1] = person;
        return newPersons;
    }
    public static void main(String[]args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

    //Create an array that holds 3 Person objects. Assign a new instance of
        // the Person class to each element. Iterate through the array and print
        // out the name of each person in the array.
        Person[] people = new Person[3];//Array holds 3 Person objects
        //Assigned new instance of the Person class to each element.
//       Person = new String[3];
        people[0] = new Person("juan");
        people[1] = new Person("julio");
        people[2] = new Person("carl");

        Person person = new Person("julia");
        Person[] people1 = addPerson(people, person);

        //Iterated through the array
        for(Person perObj: people1){
        //Prints out name of each person within the array
            System.out.println(perObj.getName());

//            public static String addPerson(String[]){
}
            }


        }

    //Create a static method named addPerson. It should accept an array of
        // Person objects, as well as a single person object to add to the
        // passed array. It should return an array whose length is 1 greater
        // than the passed array, with the passed person object at the end of
        // the array.

        //created static method named addPerson
//        static String addPerson(String[] Person= new String[0]);

        //


