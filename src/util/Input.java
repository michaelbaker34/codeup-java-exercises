package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        String userInput = scanner.next();
        return (userInput.equalsIgnoreCase("y") || (userInput.equalsIgnoreCase("yes")));
    }

    public static int getInt(int min, int max, int userInt) {
        if (userInt < min || userInt > max) {
            System.out.println("Number out of range.");
            userInt = getInt(min, max, userInt);
        }
        System.out.printf("Number below is between %d and %d%n", min, max);
        return userInt;
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max, Double userDouble) {
        if (userDouble < min || userDouble > max) {
            System.out.println("Decimal not in range.");
            userDouble = getDouble(min, max, userDouble);
        }
        return userDouble;
    }

    public static double getDouble() {
//        System.out.println("Enter a decimal: ");
        return scanner.nextDouble();
    }


}

