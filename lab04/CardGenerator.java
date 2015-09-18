//Kelly Skewis
//CSE 2
//lab04 Card Generator
//Program that generates a random card

public class CardGenerator{
    public static void main (String [] agrs){
        int cardNum;
        cardNum = (int)(Math.random() * 53) + 1;
        String suitName;
        String cardID;
        //assign suit values
        if (cardNum < 14){
            suitName = "diamonds";
        }
        else if (cardNum <27){
            suitName = "clubs";
            cardNum = cardNum - 13; //resets card number
        }
        else if (cardNum < 40){
            suitName = "hearts";
            cardNum = cardNum - 26;
        }
        else{
            suitName = "spades";
            cardNum = cardNum - 39;
        }
        switch (cardNum){
            case 1: 
            case 14:
            case 27:
            case 40:
                cardID = "ace";
            break;
            case 11:
            case 24:
            case 37:
            case 50:
                cardID = "jack";
            break;
            case 12:
            case 25: 
            case 38:
            case 51:
                cardID = "queen";
            break;
            case 13:
            case 26:
            case 39:
            case 52:
                cardID = "king";
            break;
            default:
                cardID = "" + cardNum;
            break;
        }
        System.out.println ("You picked the " + cardID + " of " + suitName + ".");
    }    
}