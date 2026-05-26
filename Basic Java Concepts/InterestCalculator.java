import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator{
    
    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double principal = scan.nextDouble();

        System.out.println("Enter the rate of interest:");
        double rate = scan.nextDouble();

        System.out.println("Enter the time period:");
        int time = scan.nextInt();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Simple Interest: " + currency.format(simpleInterest));
}
}