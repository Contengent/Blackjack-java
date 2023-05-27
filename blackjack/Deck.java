import java.util.Random;

public class Deck{
    String[] deck;
    int currentCard;
    Random rand = new Random();

    public Deck(){
        deck = new String[]{
            "A♡", "2♡", "3♡", "4♡", "5♡", "6♡", "7♡" ,"8♡", "9♡","10♡" ,"J♡", "Q♡", "K♡",
            "A♧", "2♧", "3♧", "4♧", "5♧", "6♧", "7♧" ,"8♧", "9♧","10♧" ,"J♧", "Q♧", "K♧",
            "A♢", "2♢", "3♢", "4♢", "5♢", "6♢", "7♢" ,"8♢", "9♢","10♢" ,"J♢", "Q♢", "K♢",
            "A♤", "2♤", "3♤", "4♤", "5♤", "6♤", "7♤" ,"8♤", "9♤","10♤" ,"J♤", "Q♤", "K♤"
        };

        for (int i = 0; i < deck.length; i++){
            int randomIndexToSwap = rand.nextInt(deck.length);
            String temp = deck[randomIndexToSwap];
            deck[randomIndexToSwap] = deck[i];
            deck[i] = temp;
        }

        currentCard = 0;
    }

    
    public String[] shuffleDeck(){
        for (int i = 0; i < deck.length; i++){
            int randomIndexToSwap = rand.nextInt(deck.length);
            String temp = deck[randomIndexToSwap];
            deck[randomIndexToSwap] = deck[i];
            deck[i] = temp;
        }

        currentCard = 0;
        return deck;
    }

    public String nextCard(){
        currentCard += 1;
        return deck[currentCard-1];
    }


}