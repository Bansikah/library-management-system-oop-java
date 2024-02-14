// Patron class represents a library patron
public class Patron extends Library {
    private String name;
    private int id;
    
    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void borrowBook(Book book1) {
    }

    public void displayBorrowedBooks() {
    }
}