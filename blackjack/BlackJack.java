import java.util.Scanner;
//import java.util.Arrays;
//import java.util.Random;

public class BlackJack{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Deck newDeck = new Deck();
        Players theUser = new Players(newDeck);

        Boolean ffs = true;
        String playerMove;

        

        System.out.println("Welcome to blackjack :3\n");
        
        while(ffs){
            theUser.updateScore();
            System.out.println("\nYour hand: " + theUser.hand);
            System.out.println("Your score: " + theUser.score);

            System.out.print("hit/stand/reset: ");
            playerMove = input.nextLine();

            if (playerMove.contains("hit")){
                theUser.hit(newDeck);
            } else if (playerMove.contains("stand")){
                theUser.stand();
            } else if (playerMove.contains("reset")){
                newDeck = new Deck();
                theUser = new Players(newDeck);
            }
        }

        input.close();
    }
}