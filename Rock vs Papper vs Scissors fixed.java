import java.util.Scanner;
import java.util.Random;

public class Main {

// Prints Game moves
    static void Move_pick() {
      System.out.println("\n\n1 = Rock \n2 = Papper \n3 = Scissors");
    }


    static void result(int bot_move,int Player_move) { 

      if (bot_move == Player_move){
        System.out.println("It's a Draw : |");
      }

      else if (bot_move == 1 && Player_move == 3 || bot_move == 2 && Player_move == 1 || bot_move == 3 && Player_move == 2 ){
        System.out.println("Bot Wins");
      }
      else{
        System.out.println("Player wins");
      }
      System.out.println("Player Played " + Player_move + " Bot Played " + bot_move);
    }


  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.print("Welcome To The Game \n-------------------\nPlease Pick Your Move");
    Move_pick();      

    int Player_move = myObj.nextInt();

    //Checks to see if the number is with the limit
    if (Player_move > 3 || Player_move < 1){
      // Loops until condiotions are met
      while(Player_move > 3 || Player_move <1){
        Move_pick();
        int fail_safe = myObj.nextInt();
        Player_move = fail_safe;
      }
    }

    // Picks the bots move at Random
    int bot_move = (int)(Math.random()* 4);
    //Makes sure its betweeen 1 - 3
    while (bot_move == 4){
      int Not_0 = (int)(Math.random()* 4);
      bot_move = Not_0;
    }
    
    result(bot_move, Player_move);


  }
}