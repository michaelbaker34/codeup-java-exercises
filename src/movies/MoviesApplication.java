package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        boolean running = true;
        while (running) {
            System.out.println(returnMenuDisplay());
            int userResponse = promptUserForChoice();
            running = executeUserChoice(userResponse);
        }

    }

// list options to view all movies and filter by category
        private static String returnMenuDisplay() {
            return """
                    What would you like to do?
                    0 - exit
                    1 - view all movies
                    2 - view movies in the animated category
                    3 - view movies in the drama category
                    4 - view movies in the horror category
                    5 - view movies in the scifi category
                    """;
        }

// use input class to get input from user and display info
// based on user choice
        private static int promptUserForChoice() {
            Input input = new Input();
            System.out.print("Enter your choice: ");
            return input.getInt(0, 5);
        }

// if category is selected display movies from category
        private static void viewMoviesByCategory(String category) {
            for (Movie movie : MoviesArray.findAll()) {
                if (category.equalsIgnoreCase(movie.getCategory())) {
                    System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                }
            }
        }

// run until user exit
        private static boolean executeUserChoice(int choice) {
            boolean continueRunning = true;
            switch (choice) {
                case 0:
                    continueRunning = false;
                    break;
                case 1:
                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2:
                    viewMoviesByCategory("animated");
                    break;
                case 3:
                    viewMoviesByCategory("drama");
                case 4:
                    viewMoviesByCategory("horror");
                case 5:
                    viewMoviesByCategory("scifi");
            }
            return continueRunning;
        }

}
