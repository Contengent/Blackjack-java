import java.util.ArrayList;

public class Players {
    ArrayList<String> hand;
    int score;
    int balance;
    boolean turnOver;

    public Players(Deck deck){
        turnOver = false;

        hand = new ArrayList<String>();
        hand.add(deck.nextCard()); hand.add(deck.nextCard()); // initlizing the player's hand

    }
    

    public ArrayList<String> hit(Deck deck){
        hand.add(deck.nextCard());
        return hand;
    }

    public int updateScore(){
        String currentCard;
        int numAces = 0;

        score = 0;

        for (int i = 0; i < hand.size(); i++) {
            if (hand.get(i).contains("K") || hand.get(i).contains("Q") || hand.get(i).contains("J")){
                currentCard = "10";
            } else if (hand.get(i).contains("A")) {
                numAces += 1;
                currentCard = "0";
            } else {
                currentCard = hand.get(i).substring(0, hand.get(i).length() - 1);
            }

            score += Integer.parseInt(currentCard);
        }

        if (numAces > 0){
            switch (numAces){
                case 1:
                    score = aceCheck(numAces, score);
                    break;
                case 2:
                    score = aceCheck(numAces, score);
                    break;
                case 3:
                    score = aceCheck(numAces, score);
                    break;
                case 4:
                    score = aceCheck(numAces, score);
                    break;
                default:
                    System.out.println("Something has gone terribly wrong.");
            }            
        }

        return score;
    }

    public void stand(){
        turnOver = true;
    }

    private int aceCheck(int aceNum, int score){
        aceNum = 11 + aceNum - 1;

        if(score + aceNum > 21){
            score += aceNum;
        } else{
            score += aceNum;
        }

        return score;
    }

    /* do alll of this */
    /* Ai code */

}
