//Aggregation: its a "has-a" relationship between objects. 
// In aggregation, one class contains a reference to another class, but the contained class can 
// exist independently of the container class. 
// The lifecycle of the contained class is not dependent on the lifecycle of the container class.
package ObjectConcept;
public class Library{
    private String name;
    private String location;
    private Book book; // Aggregation: Library has a Book

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void setBook(Book book) {
        this.book = book; // Setting the book for the library
    }

    public void displayLibraryInfo() {
        System.out.println("Library Name: " + name);
        System.out.println("Location: " + location);
        if (book != null) {
            System.out.println("Book Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
        } else {
            System.out.println("No book available in the library.");
        }
    }

}