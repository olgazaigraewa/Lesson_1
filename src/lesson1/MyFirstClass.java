package lesson1;


public class MyFirstClass {

    @Override
    public String toString() {
        return "MyFirstClass{}";
    }

    public static void main(String[] args) {
        Author author = new Author("Nikolai", "Nosov");
        Book book = new Book("Dreamers", author,1997);
        System.out.println("book.name = " + book.getName());
        System.out.println("author.firstName = " + author.getFirstName());
        System.out.println("author.lastName = " + author.getLastName());
        System.out.println("book.yearPublishing = " + book.getYearPublishing());
        book.setYearPublishing(2000);
        System.out.println("book.getYearPublishing() = " + book.getYearPublishing());
        System.out.println(book.getName() + " " + author.getFirstName() + " " + author.getLastName() + " " + book.getYearPublishing());
        System.out.println(new Author("Nikolai", "Nosov"));
        System.out.println(new Book("Dreamers", author,2000));

        System.out.println(" ");
        Author author1 = new Author(" Mikhail", "Bulgakov");
        Book book1 = new Book("MasterAndMargarita",author, 1990);
        System.out.println("book1.getName() = " + book1.getName());
        System.out.println("author1.getFirstName() = " + author1.getFirstName());
        System.out.println("author1.getLastName() = " + author1.getLastName());
        System.out.println("book1.getYearPublishing() = " + book1.getYearPublishing());
        System.out.println(book1.getName() + " " + author1.getFirstName() + " " + author1.getLastName() + " " + book1.getYearPublishing());
        System.out.println(new Author(" Mikhail", "Bulgakov"));
        System.out.println(new Book("MasterAndMargarita",author, 1990));

    }

}
