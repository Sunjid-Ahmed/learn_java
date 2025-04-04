package abstruct_class;

public abstract class Book {
    private String name;
    private String author;

    // Default Constructor
     public Book() {}

    // Parameterized Constructor
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();

    // Option 1: If you want to make this abstract
    // public abstract boolean isRecommendedForAge(int age);

    // Option 2: Default implementation
    public abstract boolean isRecommendedForAge(int age) ;
}