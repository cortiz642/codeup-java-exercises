import java.util.Scanner;

public class review {
//    static double r;
//    static double circle;
//    public static double radius(double r) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("What is your radius?");
////        int userInput = sc.nextInt();
////        System.out.println(userInput);
//        double pi = 3.1415;
//        return 2*pi;
//    }
//public static double total(double bill, double tipPercentage){
//
//        return bill * tipPercentage + bill;
//
//}
//
//
//    public static void main(String[] args) {
//    review circle = new review();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your radius?");
//        int userInput = sc.nextInt();
//        System.out.println(userInput);
////    circle.radius(userInput);
////    circle.total(100, 10);
//        System.out.println(total(100, .10));
//        System.out.println(circle);
//
//
//
//
//    }

//}



//    Create a method that accepts a string of space separated numbers and
//    returns the highest and lowest number (as a string).
//        example input: "1 2 3 4 5"
//        expected output: "5 1"
//        example input: "1 9 3 4 -5"
//        expected output: "-5 9"

//circle
//public class PracticeCircle {
    public static void main(String[] args) {
        int[] newArray  = new int[]{1, 2, 3, 4};
        even(newArray);
    }
    public static double radius(double radius){
        return 2 * Math.PI * radius;
    }
    public static double radius(int radius){
        return (2 * Math.PI * radius);
    }
    public static double total(double bill, double tip){
        return bill + (bill * tip/100);
    }
    public static void even(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                System.out.println(nums[i]);
            }
        }
    }
}

//Car
//package carShop;
//public class Car extends Customer{
//    private String model, make, color;
//    private int year;
//    public Car(String model, String make, String color, int year, String firstName, String lastName) {
//        super(firstName, lastName);
//        this.model = model;
//        this.make = make;
//        this.color = color;
//        this.year = year;
//    }
//    public String getModel() {
//        return model;
//    }
//    public void setModel(String model) {
//        this.model = model;
//    }
//    public String getMake() {
//        return make;
//    }
//    public void setMake(String make) {
//        this.make = make;
//    }
//    public String getColor() {
//        return color;
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public int getYear() {
//        return year;
//    }
//    public void setYear(int year) {
//        this.year = year;
//    }
//}


//customer
//package carShop;
//public class Customer implements Describable {
//    private String firstName;
//    private String lastName;
//    public Customer(String firstName, String lastName){
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//    public String getFirstName() {
//        return firstName;
//    }
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    @Override
//    public String describe(String details) {
//        return "Hey there " + this.firstName + " " + this.lastName + ", it looks like your " + details + " is ready to go!";
//    }
//}


//dealer app
//package carShop;
//public class DealerApp {
//    public static void main(String[] args) {
//        Customer person = new Customer("Jordy", "Muniz");
//        Car c = new Car("Dodge", "sxt Charger", "Black", 2010, person.getFirstName(), person.getLastName());
//        System.out.println(person.describe(String.format("%s, %s, %s, %s", c.getColor(), c.getYear(), c.getMake(), c.getModel())));
//    }
//}

//describable
//package carShop;
//public interface Describable {
//    String describe(String details);
//}

