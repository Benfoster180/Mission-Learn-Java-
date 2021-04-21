import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    //Used to set how many guess the player gets
    int Gameloop = 10;
    
    //Creates the Random Number for the bot
    Random rand = new Random();
    int Bot_number = rand.nextInt(101);
    //Checks if game is in play
    if (Gameloop == 0){
      System.out.println("You lose game over!");
    }

    //Loops the game
    System.out.println("Guess the number!");
    System.out.println("The Number is bettwen 0 - 100!");
    System.out.println("You have 10 Guess Good luck : )");
    while (Gameloop != 0){
      Gameloop = (Gameloop) - 1;
      //Used to allow us to collect a user input
      Scanner scan = new Scanner(System.in);
      
      //collects user input
      int i = scan.nextInt();
      //Calls the method to check the result
      Score_check(i, Gameloop, Bot_number);
    }

  }
    static void Score_check(int i ,int Gameloop, int Bot_number){
  // Checks if the bot number is smaller    
    if(i < Bot_number){
      System.out.print("The Number is to Small\n");
      
     
      
    }
    //Checks to see if its smaller
    if (i > Bot_number){
      System.out.println("Your Number is to Big\n");
    }
    // If its not bigger or smaller it has to be the same so yeah
    if (Bot_number == i){
      System.out.print("You win!");
      System.out.println("The bot number is " + Bot_number + "1");
    }
  }
}
