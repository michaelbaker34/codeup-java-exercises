import java.util.Scanner;

public class MethodsExercises {

    private static final Scanner sc = new Scanner(System.in);
    public static int userInt = sc.nextInt();

    public static void main(String[] args) {

//        add();
//        subtract();
//        multiply();
//        System.out.println(multiplyLoop(3, 5));
//        System.out.println(multiplyRecursion(3, 5));
//        divide();
//        mod(3, 2);
//        getInteger(1, 10);
//        getFactorial();
//        System.out.println(getFactorialRecursion(4));

    }

    public static void add() {
        System.out.println("Enter two numbers to add:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int sum = input1 + input2;
        System.out.printf("%d + %d = " + sum + "\n", input1, input2);
    }

    public static void subtract() {
        System.out.println("Enter two numbers to subtract:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int diff = input1 - input2;
        System.out.printf("%d - %d = " + diff + "\n", input1, input2);
    }

    public static void multiply() {
        System.out.println("Enter two numbers to multiply:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int product = input1 * input2;
        System.out.printf("%d * %d = " + product + "\n", input1, input2);
    }

    public static int multiplyLoop(int num1, int num2) {
        int result = 0;
        while (num1 > 0) {
            result += num2;
            num1--;
        }
        System.out.println("3 * 5 = " + result);
        return (result);
    }

    public static int multiplyRecursion(int num1, int num2) {
        int multiplied = 0;
        if (num2 != 0) {
            multiplied = num1 + multiplyRecursion(num1, num2 - 1);
        }
        return multiplied;
    }

    public static void divide() {
        System.out.println("Enter two numbers to divide:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int quotient = input1 / input2;
        System.out.printf("%d / %d = " + quotient + "\n", input1, input2);
    }

    public static int mod(int num1, int num2) {
        int mod = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + mod);
        return mod;
    }

    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 and 10:");
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Number is: " + userInput);
            return userInput;
        } else {
            System.out.print("Number out of range \n");
            return getInteger(1, 10);
        }
    }

    public static void getFactorial() {
        int userInput = sc.nextInt();
        int factorial = 1;
        if (userInput >= 1 && userInput <= 20) {
            for (int i = 1; i <= userInput; i += 1) {
                factorial = factorial * i;
                System.out.printf("%d! = %d = %d%n", i, i, factorial);
            }
        } else {
            System.out.println("number out of range");
        }
    }

    public static int getFactorialRecursion(int userInt) {
        if (userInt > 0 && userInt < 10) {
            return userInt * getFactorialRecursion(userInt - 1);
        } else {
            return 1;
        }
    }

    public void setDiceSides() {
        System.out.println("Enter number of sides: ");
        int diceSides = userInt;
    }

//    public static int getDiceSides() {
//        return diceSides;
//    }


}
