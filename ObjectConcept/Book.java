package ObjectConcept;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void  displayBookInfo() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this. author);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
