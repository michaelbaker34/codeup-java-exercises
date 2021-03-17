package movies;

public class Movie {
    private String name;
    private String category;

// set movie constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

// movie name setter
    public String setName(String name) {
        return this.name = name;
    }

// movie name getter

    public String getName() {
        return name;
    }

// category setter
    public String setCategory(String category) {
        return this.category = category;
    }

// category getter

    public String getCategory() {
        return category;
    }

}
