import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        // System.out.print("Hello, ");
        // System.out.println("World!");

        // int myFavoriteNumber = 1;
        // System.out.println("ln 08: " + myFavoriteNumber);

        // String myString = "string";
        // System.out.println("ln 11: " + myString);

        // double myNumber = 3.14;
        // myNumber = 1.23F;
        // System.out.println("ln 14: " + myNumber);

        // int x = 5;
        // System.out.println(x++);
        // System.out.println(x);

        // System.out.println(++x);
        // System.out.println(x);

        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;
        // int three = (int) "three";

        // int x = 4 + 5;
        // System.out.println(x);

        // int y = 3 * 4;
        // System.out.println(y);

        // int y = 2 - 5;
        // System.out.println(y);

        // int max = Integer.MAX_VALUE;
        // int min = Integer.MIN_VALUE;
        // max++;
        // min--;
        // System.out.println(max);
        // System.out.println(min);

        // String first = "first";
        // String last = "last";
        // System.out.printf("%s %s", first, last);

        // String first = "first";
        // String state = "texas";
        // int age = 1;
        // System.out.printf("%s is from %s and is %d years old", first, state, age);

        System.out.println("Enter 3 names:");
        printNames();
    }

    public static void printNames(String name) {
        System.out.printf("One: %s \n", name);
    }

    public static void printNames(String name, String name2) {
        System.out.printf("Two: %s and %s \n", name, name2);
    }

    public static void printNames(String name, String name2, String name3) {
        System.out.printf("Three: %s, %s, and %s \n", name, name2, name3);
    }

    public static void printNames() {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String name2 = sc.nextLine();
        String name3 = sc.nextLine();
        printNames(name);
        printNames(name, name2);
        printNames(name, name2, name3);
    }

}
