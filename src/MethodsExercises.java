import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {


//        add();
//        subtract();
//        multiply();
//        divide();
//        mod();

    }

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to add:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int sum = input1 + input2;
        System.out.printf("%d + %d = " + sum + "\n", input1, input2);
    }

    public static void subtract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to subtract:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int diff = input1 - input2;
        System.out.printf("%d - %d = " + diff + "\n", input1, input2);
    }

    public static void multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to multiply:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int product = input1 * input2;
        System.out.printf("%d * %d = " + product + "\n", input1, input2);
    }

    public static void divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to divide:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int quotient = input1 / input2;
        System.out.printf("%d / %d = " + quotient + "\n", input1, input2);
    }

//    public static void mod() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers to find the remainder:");
//        int input1 = sc.nextInt();
//        int input2 = sc.nextInt();
//        int mod = input1 % input2;
//        System.out.printf("%d % %d = " + mod + "\n", input1, input2);
//    }



}
