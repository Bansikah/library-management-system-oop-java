public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a new library
        Library library = new Library();

        // Add some books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9781234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780987654321");
        library.addBook(book1);
        library.addBook(book2);

        // Create a patron
        Patron patron = new Patron("John Doe", 1001);

        // Patron borrows a book
        patron.borrowBook(book1);

        // Display the books in the library
        library.displayBooks();

        // Display the books borrowed by the patron
        patron.displayBorrowedBooks();
    }
}