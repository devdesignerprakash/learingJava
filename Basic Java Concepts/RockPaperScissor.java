import java.util.Scanner;

public class RockPaperScissor{

    public static void main(String[] args){
    System.out.print("********---WELCOME TO ROCKPAPER SCISSORS-----************");
    Scanner sc= new Scanner(System.in);
    String[] choices= {"rock","paper","scissor"};
    int computerChoice=(int)(Math.random()*3);
    String computerMove=choices[computerChoice];
    System.out.print("\nEnter your move (rock, paper, scissor): ");
    String playerChoice= sc.nextLine().toLowerCase();
    if(playerChoice.equals(computerMove)){
        System.out.println("It's a tie! Computer also chose "+computerMove);
    } else if((playerChoice.equals("rock") && computerMove.equals("scissor")) ||
              (playerChoice.equals("paper") && computerMove.equals("rock")) ||
              (playerChoice.equals("scissor") && computerMove.equals("paper"))){
        System.out.println("Congratulations! You win! Computer chose "+computerMove);
    } else {
        System.out.println("Sorry! You lose! Computer chose "+computerMove);

    }

    }

}