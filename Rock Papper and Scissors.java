import java.util.Scanner;
import java.util.Random;
//Player Key
// 1 Is Rock
// 2 is Papper
// 3 is Scissors

//Bot Key
// 0 is Rock
// 1 is Papper
// 2 is Scissors

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    //Game Text
    System.out.println("Welcome to Rock, Paper and Scissors!");
    System.out.println("\nPlayer move code\n\n1 = Rock\n2 = Paper\n3 = Scissors");
    System.out.println("\nBot move code\n \n0 = Rock \n1 = Papper \n2 = Scissors");
    System.out.println("\n Please Make your move!");
    int move = myObj.nextInt();
    int bot_move = (int)(Math.random()* 3);
    System.out.println("Player played " + move + " Bot played "+ bot_move);
    // All the Outcomes if the player plays Rock
    if(move == 1 && bot_move == 0){
      System.out.println("It's a draw!");
    }
    if (move == 1 && bot_move == 1){
      System.out.println("Bot Wins");
    }
    if (move == 1 && bot_move == 2){
      System.out.println("Player Wins");
    }
    //All outcomes for if the player Papper
    if (move == 2 && bot_move == 0){
      System.out.println("Player Wins");
    }
    if (move == 1 && bot_move == 1){
      System.out.println("It's a draw!");
    }
    if (move == 1 && bot_move == 2){
      System.out.println("Bot wins");

    }
    // All out comes if the player plays Scissors
    if (move == 3 && bot_move == 0){
      System.out.println("Bot Wins");
    }
    if (move == 3 && bot_move == 1){
      System.out.println("Player wins!");
    }
    if (move == 3 && bot_move == 2){
      System.out.println("It's a Draw");
    }
  }
}