package lesson1;
public class Book {
    private final String name;
     int yearPublishing;
    public Book (String name, String firstName, String lastName, int yearPublishing) {
        this.name = name;
        this.yearPublishing = yearPublishing;

    }
    public String getName() {
        return this.name;
    }
    public int getYearPublishing() {
        return this.yearPublishing;
    }
    public void setYearPublishing (int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }


}




