import java.util.Scanner;

public class NumberGuessing {


    public static void main(String[]args){
        Scanner board;
        int randomNumber, guess;
        board = new Scanner(System.in);
        String decision;
        do{
        randomNumber = (int)(Math.random()*100);


        System.out.println("Welcome to the number guessing game. In this game");
        System.out.println("you are going to try and guess the number I am thinking of.");
        System.out.println("Ok start out by guessing a number 0-100");

        do {
            guess = board.nextInt();
            if (guess == randomNumber)
            {System.out.println("You're either cheating or you need to hit the lottery because YOU WON");}


            else if (guess < randomNumber)
            {System.out.println("A little to low for my taste. Guess again");}

            else if (guess > randomNumber)
            {System.out.println("As high as Snoop Dog. Guess again");}
        }while(guess!=randomNumber);
        System.out.println("would you like to play again?");
        decision = board.nextLine();
        }while(!board.nextLine().equals("no"));
        System.out.println("Thanks for playing!");









    }
}
