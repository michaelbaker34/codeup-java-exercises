import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


//        for (int i = 0; i < 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int inputSquared = input * input;
        int inputCubed = input * input * input;
        System.out.println("Number \t| Squared | Cubed");
        for (int i = 0; i < input; i++) {
            System.out.printf("%d \t\t | %d \t | %d \n", input, inputSquared, inputCubed);
        }

    }
}
