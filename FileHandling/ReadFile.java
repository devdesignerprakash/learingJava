package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args){
        String filePath= "C:\\Users\\Prakash\\OneDrive\\Desktop\\url.txt";
       

        try{
             BufferedReader reader= new BufferedReader(new FileReader(filePath));
             System.out.println("This file exist");
             String line;

             while((line=reader.readLine())!=null){
                System.out.println(line);
             }

        }catch(FileNotFoundException e){
            System.out.println("This file does not exist");
        }
        catch(IOException e){
            e.printStackTrace();
        }  
    }
}
