import java.text.NumberFormat;

public class Formatting {

    public static String formatCurrency(double amount) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(amount);
    }

    public static void main(String[] args) {
        double amount = 1234.56;
        String formattedAmount = Formatting.formatCurrency(amount);
        System.out.println("Formatted Amount: " + formattedAmount);

    }

}
