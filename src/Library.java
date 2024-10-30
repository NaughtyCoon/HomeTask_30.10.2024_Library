import java.util.*;


public class Library {
    ArrayList<Book> booksList = new ArrayList<>();
    HashSet<Book> booksSet = new HashSet<>();
    HashMap<Integer, Book> booksMap = new HashMap<>();

    public void addBook(Book book){
        booksList.add(book);
        booksSet.add(book);
        booksMap.put(book.getId(), book);
    }
    public void removeBookByID(int id){
        Book book = booksMap.remove(id);
        if (book != null){
            booksSet.remove(book);
            booksList.remove(book);
        }
    }
    public Book findBookByTitle(String title){
        for (Book book : booksList){
            if (book.getTitle().equalsIgnoreCase(title)){
               return book;
            }
        }
        return null;
    }
    public void listAllBooks(){
        booksList.forEach(System.out::println);
        System.out.println();
    }
    public void listBooksByAuthor(String author){
        booksList.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .forEach(System.out::println);
        System.out.println();
    }

}
