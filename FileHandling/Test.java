package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public static void main(String[] args){
        String filePath="test.txt";
        String content="This is a test file for demonstrating file handling in Java.";
    
        try{
             // Writing to the file
            FileWriter writer= new FileWriter(filePath);
            writer.write(content);
            System.out.println("File written successfully.");
            writer.close();

        }
        catch(IOException e){
            e.printStackTrace();

    } 
    finally{

    }   
}
}
