import java.util.Scanner;

public class BasicCalculator{

    public static double calculation(double a, double b, String operator){
        switch(operator){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if(b != 0){
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN; // Not a Number
                }
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                return Double.NaN; // Not a Number
        }
    }

    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sca.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = sca.nextDouble();

            System.out.println("Enter the operator (+, -, *, /): ");
            String operator = sca.next();

            double result = calculation(num1, num2, operator);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
            sca.close();
    } 
}