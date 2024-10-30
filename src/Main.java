import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book(1, "It", "Steven King"));
        library.addBook(new Book(2, "Treasure Island", "Robert Louis Stevenson"));
        library.addBook(new Book(3, "Clean Code", "Robert Martin"));
        library.addBook(new Book(4, "Alice in Wonderland", "Lewis Carroll"));
        library.addBook(new Book(5, "Birds", "Steven King"));

        System.out.println("All books in the library:");
        library.listAllBooks();

        System.out.println("Search result for title \"clean code\"");
        System.out.println(library.findBookByTitle("clean code").toString() + "\n");

        System.out.println("Deleting book id 4:");
        library.removeBookByID(4);
        library.listAllBooks();

        System.out.println("Search result for author \"steven king\"");
        library.listBooksByAuthor("steven king");
    }
}