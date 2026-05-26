import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter your name:");
       String name = scan.nextLine();
       System.out.println("Enter your age:");
       int age = scan.nextInt();
       System.out.println("Hello %s, you are %d years old.".formatted(name, age));
    }
}
