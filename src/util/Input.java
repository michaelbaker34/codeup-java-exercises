package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        String input = scanner.next();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

// get int
    public int getInt() throws IllegalArgumentException {
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            System.out.printf("Input not parsed to int. %s", e.getMessage());
            System.out.print("Try again: ");
            return getInt();
        }
//        if (scanner.hasNextInt()) {
//            return scanner.nextInt();
//        } else {
//            System.out.println("Invalid input; please enter an integer!");
//            scanner.nextLine();
//            return getInt();
//        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.printf("Out of range. Please enter a number between %d and %d.", min, max);
            return getInt(min, max);
        }
    }

// get double
    public double getDouble() throws IllegalArgumentException {
        double myDouble = Double.parseDouble(getString());
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Invalid input; please enter a number!");
            scanner.nextLine();
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.println("Out of range. Please enter a number between " + min + " and " + max + ".");
            return getDouble(min, max);
        }
    }


}