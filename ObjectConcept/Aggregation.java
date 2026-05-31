package ObjectConcept;

public class Aggregation {
    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        book1.displayBookInfo();

        // Create a Library object
        Library library = new Library("City Library", "Downtown");

        // Set the book for the library (aggregation)
        library.setBook(book1);

        // Display library information
        library.displayLibraryInfo();
    }
    
}
