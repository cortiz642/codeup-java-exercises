package util;
import java.util.Objects;
import java.util.Scanner;

public class Input {
        private final Scanner scanner;

    public String getString() {
        System.out.println("type something:");
        String user = scanner.nextLine();
        System.out.println("you typed:\"" + user + "\"");
        return scanner.nextLine();
    }
    public boolean yesNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
            String userInput = sc.next();
        if(Objects.equals(userInput, "y")) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        return Boolean.parseBoolean(scanner.nextLine());
    }
    public int getInt(int min, int max) {
        System.out.println("Please enter integer:");
//        int one = Integer.parseInt(getString());
//        int userInput = scanner.nextInt();
        int userInput = Integer.parseInt(getString());
        if (userInput != min) {
//            System.out.println("Please enter integer:");
        }else{
//            System.out.println("You entered:" + userInput);
        }
        return scanner.nextInt();
    }
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Input getString = new Input();
        getString.getString();
        Input yesNo = new Input();
        yesNo.yesNo();
        Input getInt = new Input();
        getInt.getInt(10, 30);
    }
    }


//        System.out.println("type something");
//        int userInput = scanner.nextInt();
//        System.out.println("you typed:\""  + userInput + "\" ");

