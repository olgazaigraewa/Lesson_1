package lesson1;
public class Book {
    private final String name;

    private final Author author;

    private int yearPublishing;

    public Book (String name, Author author, int yearPublishing) {

        this.name = name;

        this.author = author;

        this.yearPublishing = yearPublishing;

    }


    public String getName() {
        return this.name;
    }
    public int getYearPublishing() {
        return this.yearPublishing;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

}




