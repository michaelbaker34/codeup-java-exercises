package movies;

public class Movie {
    private String name;
    private String category;

// set movie constructor
    public Movie(String name, String category) {

    }


// movie setter
    public String setMovie(String title) {
        return String.format("Title: %s%n", title);
    }

// movie getter


// category setter
    public String setCategory(String category) {
        return String.format("Category: %s%n", category);
    }

// category getter


}
