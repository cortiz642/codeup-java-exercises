public class MethodsExercises {
    public static void main(String[] args) {


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
}
