import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey?");
        String userInput = sc.next();
//        System.out.println("Who?");
//        String userInput = sc.next();
        String input = new String();
        boolean ask = input.endsWith("?");

        boolean exclamation = input.endsWith("!");

        boolean empty = input.isEmpty();

        if (ask) {System.out.println("Sure");}
        else if (exclamation) {System.out.println("Whoa, chill out!");
        }
        else if (empty) {System.out.println("Fine Be that way!");
        }
        else {System.out.println("Whatever");
        }

    }
}
