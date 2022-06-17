package movies;

public class Movie {
    private String name;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String movieName) {
        this.name = movieName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String movieCategory) {
        this.category = movieCategory;
    }

    private String category;
}
