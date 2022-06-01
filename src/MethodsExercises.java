import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) throws ParseException {


        //Basic Arithmetic
        //
        //Create four separate methods. Each will perform an arithmetic operation:
        //
        //Addition
        System.out.println(Addition(9, 9));
        //Subtraction
        System.out.println(Subtraction(9, 9));
        //Multiplication
        System.out.println(Multiplication(9, 9));
        //Division
        System.out.println(Division(9, 9));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your date of birth (dd-MM-yyyy): ");
        String dob = sc.next();
        //Converting String to Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(dob);
        //Converting obtained Date object to LocalDate object
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();
        //Calculating the difference between given date to current date.
        Period period = Period.between(givenDate, LocalDate.now());
        System.out.print("Hello "+name+" your current age is: ");
        System.out.print(period.getYears()+" years "+period.getMonths()+" and "+period.getDays()+" days");


    }

    public static int Addition(int a, int b) {
        return a + b;
    }

    public static int Subtraction(int a, int b) {
        return a - b;
    }

    public static int Multiplication(int a, int b) {
        return a * b;
    }

    public static int Division(int a, int b) {
        return a / b;
    }
    public static Date StringToDate(String dob) throws ParseException {
        //Instantiating the SimpleDateFormat class
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        //Parsing the given String to Date object
        Date date = formatter.parse(dob);
        System.out.println("Date object value: " + date);
        return date;
    }


}


