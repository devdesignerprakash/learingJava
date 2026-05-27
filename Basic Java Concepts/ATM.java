import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        double balance = 200000.00;
        int pin = 3693;
        int attempts = 0;
        boolean isRunning = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("************** Welcome To Prime Bank ATM ****************");

        while (isRunning) {

            System.out.print("Enter your pin: ");
            int inputPin = scanner.nextInt();

            if (inputPin == pin) {

                attempts = 0;
                boolean isPinCorrect = true;

                while (isPinCorrect) {

                    System.out.println("\n1. Check Balance");
                    System.out.println("2. Withdraw Money");
                    System.out.println("3. Deposit Money");
                    System.out.println("4. Exit");

                    System.out.print("Choose an option: ");
                    int option = scanner.nextInt();

                    switch (option) {

                        case 1:
                            System.out.println("Your balance is: " + balance);
                            isRunning = false;
                            isPinCorrect = false;
                            break;

                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();

                            if (withdrawAmount <= 0) {
                                System.out.println("Invalid amount.");
                            }
                            else if (withdrawAmount > balance) {
                                System.out.println("Insufficient funds.");
                            }
                            else {
                                balance -= withdrawAmount;
                                System.out.println("You have withdrawn: " + withdrawAmount);
                                System.out.println("Your new balance is: " + balance);
                                isRunning = false;
                                isPinCorrect=false;
                            }
                            break;

                        case 3:
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = scanner.nextDouble();

                            if (depositAmount <= 0) {
                                System.out.println("Invalid amount.");
                            }
                            else {
                                balance += depositAmount;
                                System.out.println("You have deposited: " + depositAmount);
                                System.out.println("Your new balance is: " + balance);
                                isRunning = false;
                                isPinCorrect=false;
                            }
                            break;

                        case 4:
                            isPinCorrect = false;
                            isRunning = false;
                            System.out.println("Thank you for using Prime Bank ATM. Goodbye!");
                            break;

                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                }

            } else {

                attempts++;
                System.out.println("Incorrect pin. Please try again.");

                if (attempts >= 3) {
                    System.out.println("Too many incorrect attempts. Your account has been locked.");
                    isRunning = false;
                }
            }
        }

        scanner.close();
    }
}