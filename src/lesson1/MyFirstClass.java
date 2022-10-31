package lesson1;


public class MyFirstClass {

    public static void main(String[] args) {
        Book book = new Book("Dreamers", "Nikolai", "Nosov",1997);
        System.out.println("book.name = " + book.getName());
        Author author= new Author("Nikolai", "Nosov");
        System.out.println("author.firstName = " + author.getFirstName());
        System.out.println("author.lastName = " + author.getLastName());
        System.out.println("book.yearPublishing = " + book.getYearPublishing());
        book.setYearPublishing(2000);
        System.out.println("book.getYearPublishing() = " + book.getYearPublishing());
        System.out.println(" ");

        Book book1 = new Book("MasterAndMargarita", " Mikhail", "Bulgakov", 1990);
        System.out.println("book1.getName() = " + book1.getName());
        Author author1 = new Author(" Mikhail", "Bulgakov");
        System.out.println("author1.getFirstName() = " + author1.getFirstName());
        System.out.println("author1.getLastName() = " + author1.getLastName());
        System.out.println("book1.getYearPublishing() = " + book1.getYearPublishing());


    }
}
