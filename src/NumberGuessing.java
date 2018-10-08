import java.util.Scanner;

public class NumberGuessing {


    public static void main(String[]args){
        Scanner board;
        int randomNumber,attempts,guess;
        board = new Scanner(System.in);
        do{
        randomNumber = (int)(Math.random()*100);
            attempts = 0;


        System.out.println("Welcome to the number guessing game. In this game");
        System.out.println("you are going to try and guess the number I am thinking of.");
        System.out.println("You have seven attempts so use your guesses wisely.");
        System.out.println("Ok start out by guessing a number 0-100");

        do {
            guess = board.nextInt();
            if (guess == randomNumber)
            {System.out.println("You're either cheating or you need to hit the lottery because YOU WON");}


            else if (guess < randomNumber)
            {System.out.println("A little to low for my taste. Guess again");}

            else if (guess > randomNumber)
            {System.out.println("As high as Snoop Dog. Guess again");}
                attempts++;
        }while(guess!=randomNumber&&attempts<7);
        System.out.println("Good game, a valiant effort. Would you like to play again?");
        board.nextLine();
        }while(!board.nextLine().equals("no"));
        System.out.println("Thanks for playing!");









    }
}
