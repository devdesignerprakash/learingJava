import java.util.Scanner;

public class NumberGuessing{

    public static void main(String[] args){
        
        int randomNumber=(int)(Math.random()*100)+1;
        int userGuess=0;
        int attempts=10;

    while(userGuess!=randomNumber && attempts>0){
        Scanner sca = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        userGuess = sca.nextInt();
        attempts--;

        if(userGuess<randomNumber){
            System.out.println("Too low! Try again.");
            System.err.println("Attempts left: " + attempts);
        } else if(userGuess>randomNumber){
            System.out.println("Too high! Try again.");
            System.err.println("Attempts left: " + attempts);
        } else if(attempts == 0){
            System.out.println("Sorry, you've run out of attempts. The number was: " + randomNumber);
        } else {
            System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
        }
    }
    }
}