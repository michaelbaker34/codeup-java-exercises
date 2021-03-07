import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();
        char lastChar = userInput.charAt(0);
        System.out.println("Talk to Bob:");
        System.out.println(userInput);

//      Bob answers 'Sure.' if you ask him a question.
//        (the input ends with a question mark)

        if (lastChar == '.') {
            System.out.println("Sure.");
        }

//      He answers 'Whoa, chill out!' if you yell at him.
//        (the input ends with an exclamation mark)

        if (lastChar == '!') {
            System.out.println("Whoa, chill out!");
        }

//      He says 'Fine. Be that way!' if you address him without saying anything.
//          (empty input)
//      He answers 'Whatever.' to anything else.


        if (userInput.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }


    }
}
