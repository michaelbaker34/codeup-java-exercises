import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        String piFormatted = String.format("Value of pi is approx %.2f", pi);
//        System.out.println(piFormatted);


        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a number");
//        int numberInput = sc.nextInt();
//        System.out.println(numberInput);

//        System.out.println("Enter 3 words");
//        String wordOne = sc.next();
//        String wordTwo = sc.next();
//        String wordThree = sc.next();
//        System.out.printf("%s \n%s \n%s", wordOne, wordTwo, wordThree);

//        System.out.println("Enter a sentence");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        System.out.print("enter length: ");
        String lengthInput = sc.next();
        System.out.print("enter width: ");
        String widthInput = sc.next();
        double length = Integer.parseInt(lengthInput);
        double width = Integer.parseInt(widthInput);
        Double area = length * width;
        Double perimeter = (length * 2) * (width * 2);
        System.out.printf("Area: %.2f \nPerimeter: %.2f", area, perimeter);

    }
}
