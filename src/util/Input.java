package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

//    yes/no bool
    public boolean yesNo() {
        String userInput = scanner.next();
        return (userInput.equalsIgnoreCase("y") || (userInput.equalsIgnoreCase("yes")));
    }

//    validate int
    public int getInt(int min, int max) {
//        System.out.printf("Enter a number between %d and %d: %n", min, max);
        int userInt = getInt();
        if (userInt < min || userInt > max) {
            System.out.println("Number out of range");
            return getInt(min, max);
        }
        return userInt;
    }

//    return int
    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Invalid input.");
            scanner.nextLine();
            return getInt();
        }
    }

//    validate double
    public double getDouble(double min, double max) {
        System.out.printf("Enter a decimal between %.2f and %.2f: ", min, max);
        double userDouble = getDouble();
        if (userDouble < min || userDouble > max) {
            System.out.println("Decimal out of range.");
            return getDouble(min, max);
        }
        return userDouble;
    }

//    return double
    public double getDouble() {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }
        System.out.println("Invalid input.");
        scanner.nextLine();
        return getDouble();
    }

}

