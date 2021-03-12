import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"adj1", "adj2", "adj3"};
    public static String[] nouns      = {"noun1", "noun2", "noun3"};

    public static String getWord(String[] words) {
        Random random = new Random();
        int randomNum = random.nextInt(words.length);
        return words[randomNum];
    }

    public static void main(String[] args) {

        System.out.print("Server Name: ");
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));

    }

}
