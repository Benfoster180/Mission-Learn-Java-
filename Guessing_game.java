import java.security.Guard;

import com.sun.java_cup.internal.runtime.Scanner;
import java.util.Random;


class Main {
  public static void main(String[] args) {
    Random rn = new Random();
    System.out.println("Guessing Game!\n");;
    int answer = rn.nextInt(10) + 1;

  }
  static void myguess(){
    Scanner myobj = new Scanner(System.in);
    String my_guess = myObj.nextline();
    isintcheck(my_guess, answer);
  }
  static void isintcheck(int my_guess, int answer){
    if (my_guess > answer){
      System.out.println("Your Number is Bigger\n Please Guess again!");
    }
      myguess();
    if (my_guess < answer){
      System.out.println("The number smaller");
      myguess();
    }
    if (my_guess == answer){
      System.out.println("You guess correctly!");
      break;
    }
    
    }
    
}
