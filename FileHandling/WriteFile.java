package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        // In Java, you can write to a file using various classes from the java.io package, such as FileWriter, BufferedWriter, and PrintWriter. 
        // Here's a simple example of how to write to a file using FileWriter:

        String filePath = "example.txt"; // Specify the file path
        String content = "Hello, this is a sample text written to the file."; // Content to write

        try (FileWriter writer = new FileWriter(filePath)) { // Create a FileWriter object
            writer.write(content); // Write content to the file
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions
        }
    }

    
}
