package util;
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
        System.out.println("you typed:\"" + userInput + "\"" );
        return Boolean.parseBoolean(scanner.nextLine());
    }
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
    Input Getstring = new Input();
    Getstring.getString();
    Input yesNo = new Input();
    yesNo.yesNo();

    }
    }


//        System.out.println("type something");
//        int userInput = scanner.nextInt();
//        System.out.println("you typed:\""  + userInput + "\" ");

