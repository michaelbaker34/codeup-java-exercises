import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        initializeGame();
    }

    public static void initializeGame() {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 100) + 1;

        System.out.print("Guess number between 1 and 100: ");
        playGame(scanner, randomNum);
    }

    public static void playGame(Scanner scanner, int randomNum) {
        int userGuess = scanner.nextInt();

        if (userGuess < 1 || userGuess > 100) {
            System.out.println("Number out of bounds");
            playGame(scanner, randomNum);
        } else {
            String response = checkGuess(userGuess, randomNum);
            if (response.equals("Correct")) {
                System.out.println(response);
            } else {
                System.out.println(response);
                playGame(scanner, randomNum);
            }
        }

    }

    public static String checkGuess(int guess, int targetNum) {
        if (guess == targetNum) {
            return "Correct";
        } else if (guess > targetNum) {
            return "lower";
        } else if (guess < targetNum) {
            return "higher";
        }
        return "done";
    }

}
