import java.util.Scanner;

public class NumberGuessing {


    public static void main(String[]args){
        Scanner board;
        int pickedNumber, guess;



        board = new Scanner(System.in);

        pickedNumber = (int)(Math.random()*100);
        System.out.println(pickedNumber);
        System.out.println("Welcome to the number guessing game. In this game");
        System.out.println("you are going to try and guess the number I am thinking of.");
        System.out.println("Ok start out by guessing a number 1-100");
        guess = board.nextInt();
        if (guess == pickedNumber){
            System.out.println("Your either cheating or ypu need to hit the lottery because YOU WON");
        }
        else if (guess < pickedNumber){
            System.out.println("A little to low for my taste");
        }
        else if (guess > pickedNumber){
            System.out.println("As high as Snoop Dog");
        }


    }
}
