import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private String name;
    private int id;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }


    public void borrowBook(Patron patron, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            patron.borrowBook(book);
        } else {
            System.out.println("The book is not available for borrowing.");
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }

}
