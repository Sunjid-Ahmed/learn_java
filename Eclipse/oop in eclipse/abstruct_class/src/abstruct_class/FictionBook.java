package abstruct_class;

public class FictionBook extends Book {
    private String genre;

    public FictionBook() {
    }

    public FictionBook(String name, String author, String genre) {
        super(name, author);
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());    // Use getter
        System.out.println("Author: " + getAuthor()); // Use getter
        System.out.println("Genre: " + genre);
    }

    @Override
    public boolean isRecommendedForAge(int age) {
        return age>5;
    }
}
