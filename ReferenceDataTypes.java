import java.util.Date;

public class ReferenceDataTypes {
    public static void main(String[] args) {
        String name = "John Doe";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
        // others
        Date currentDate = new Date();
        System.out.println("Current date and time: " + currentDate.toString());
    }
}