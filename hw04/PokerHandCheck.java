//Kelly Skewis
//CSE 2
//Hw04

public class PokerHandCheck{
    public static void main (String [] agrs){
        //assign variables
        int cardNum1;
        int cardNum2;
        int cardNum3;
        int cardNum4;
        int cardNum5;
        cardNum1 = (int)(Math.random () *53) + 1;
        cardNum2 = (int)(Math.random () *53) + 1;
        cardNum3 = (int)(Math.random () *53) + 1;
        cardNum4 = (int)(Math.random () *53) + 1;
        cardNum5 = (int)(Math.random () *53) + 1;
        String suitName1;
        String suitName2;
        String suitName3;
        String suitName4;
        String suitName5;
        String cardID1;
        String cardID2;
        String cardID3;
        String cardID4;
        String cardID5;
        
    //card assignment
    //if loops
        //1
            if (cardNum1 < 14){
                suitName1 = "diamonds";
            }
            else if (cardNum1 < 27){
                suitName1 = "clubs";
                cardNum1 = cardNum1 - 13; //resets card number
            }
            else if (cardNum1 < 40){
                suitName1 = "hearts";
                cardNum1 = cardNum1 - 26;
            }
            else{
                suitName1 = "spades";
                cardNum1 = cardNum1 - 39;
            }
        //2
            if (cardNum2 < 14){
                suitName2 = "diamonds";
            }
            else if (cardNum2 < 27){
                suitName2 = "clubs";
                cardNum2 = cardNum2 - 13;
            }
            else if (cardNum3 < 40){
                suitName2 = "hearts";
                cardNum2 = cardNum2 - 26;
            }
            else{
                suitName2 = "spades";
                cardNum2 = cardNum2 - 39;
            }
        //3
            if (cardNum3 < 14){
                suitName3 = "diamond";
            }
            else if (cardNum3 < 27){
                suitName3 = "clubs";
                cardNum3 = cardNum3 - 13;
            }
            else if (cardNum3 < 40){
                suitName3 = "hearts";
                cardNum3 = cardNum3 - 26;
            }
            else{
                suitName3 = "spades";
                cardNum3 = cardNum3 - 39;
            }
        //4
            if (cardNum4 < 14){
                suitName4 = "diamonds";
            }
            else if (cardNum4 < 27){
                suitName4 = "clubs";
                cardNum4 = cardNum4 - 13;
            }
            else if (cardNum4 < 40){
                suitName4 = "hearts";
                cardNum4 = cardNum4 - 26;
            }
            else{
                suitName4 = "spades";
                cardNum4 = cardNum4 - 39;
            }
        //5
            if (cardNum5 < 14){
                suitName5 = "diamonds";
            }
            else if (cardNum5 < 27){
                suitName5 = "clubs";
                cardNum5 = cardNum5 - 13;
            }
            else if (cardNum5 < 40){
                suitName5 = "hearts";
                cardNum5 = cardNum5 - 26;
            }
            else{
                suitName5 = "spades";
                cardNum5 = cardNum5 - 39;
            }
    //switch loops
        //1
            switch (cardNum1){
                case 1: 
                case 14:
                case 27:
                case 40:
                    cardID1 = "ace";
                break;
                case 11:
                case 24:
                case 37:
                case 50:
                    cardID1 = "jack";
                break;
                case 12:
                case 25: 
                case 38:
                case 51:
                    cardID1 = "queen";
                break;
                case 13:
                case 26:
                case 39:
                case 52:
                    cardID1 = "king";
                break;
                default:
                    cardID1 = "" + cardNum1;
                break;
            }
        //2    
            switch (cardNum2){
                case 1: 
                case 14:
                case 27:
                case 40:
                    cardID2 = "ace";
                break;
                case 11:
                case 24:
                case 37:
                case 50:
                    cardID2 = "jack";
                break;
                case 12:
                case 25: 
                case 38:
                case 51:
                    cardID2 = "queen";
                break;
                case 13:
                case 26:
                case 39:
                case 52:
                    cardID2 = "king";
                break;
                default:
                    cardID2 = "" + cardNum2;
                break;
            }
        //3
            switch (cardNum3){
                case 1: 
                case 14:
                case 27:
                case 40:
                    cardID3 = "ace";
                break;
                case 11:
                case 24:
                case 37:
                case 50:
                    cardID3 = "jack";
                break;
                case 12:
                case 25: 
                case 38:
                case 51:
                    cardID3 = "queen";
                break;
                case 13:
                case 26:
                case 39:
                case 52:
                    cardID3 = "king";
                break;
                default:
                    cardID3 = "" + cardNum3;
                break;
            }
        //4
            switch (cardNum4){
                case 1: 
                case 14:
                case 27:
                case 40:
                    cardID4 = "ace";
                break;
                case 11:
                case 24:
                case 37:
                case 50:
                    cardID4 = "jack";
                break;
                case 12:
                case 25: 
                case 38:
                case 51:
                    cardID4 = "queen";
                break;
                case 13:
                case 26:
                case 39:
                case 52:
                    cardID4 = "king";
                break;
                default:
                    cardID4 = "" + cardNum4;
                break;
            }
        //5
            switch (cardNum5){
                case 1: 
                case 14:
                case 27:
                case 40:
                    cardID5 = "ace";
                break;
                case 11:
                case 24:
                case 37:
                case 50:
                    cardID5 = "jack";
                break;
                case 12:
                case 25: 
                case 38:
                case 51:
                    cardID5 = "queen";
                break;
                case 13:
                case 26:
                case 39:
                case 52:
                    cardID5 = "king";
                break;
                default:
                    cardID5 = "" + cardNum5;
                break;
            }
        System.out.println ("Your random cards were:");
        System.out.println ("the " + cardID1 + " of " + suitName1 + ".");
        System.out.println ("the " + cardID2 + " of " + suitName2 + ".");
        System.out.println ("the " + cardID3 + " of " + suitName3 + ".");
        System.out.println ("the " + cardID4 + " of " + suitName4 + ".");
        System.out.println ("the " + cardID5 + " of " + suitName5 + ".");
        
        if ((cardNum1 == cardNum2) && (cardNum2 == cardNum3) || (cardNum1 == cardNum2) && (cardNum2 == cardNum4) || (cardNum1 == cardNum2)
        && (cardNum2 == cardNum5) || (cardNum1 == cardNum3) && (cardNum3 == cardNum4) || (cardNum1 == cardNum3) && (cardNum3 == cardNum5) ||
        (cardNum1 == cardNum4) && (cardNum4 == cardNum5) || (cardNum2 == cardNum3) && (cardNum3 == cardNum4) || (cardNum2 == cardNum3) 
        && (cardNum3 == cardNum5) || (cardNum2 == cardNum4) && (cardNum4 == cardNum5) || (cardNum3 == cardNum4) && (cardNum4 == cardNum5)){
            System.out.println ("You have a triple!");
        }
        else if ((cardNum1 == cardNum2) && (cardNum3 == cardNum4) || (cardNum1 == cardNum2) && (cardNum3 == cardNum5) ||
        (cardNum1 == cardNum2) && (cardNum4 == cardNum5) || (cardNum1 == cardNum3) && (cardNum2 == cardNum4) || (cardNum1 == cardNum3)
        && (cardNum2 == cardNum5) || (cardNum1 == cardNum4) && (cardNum2 == cardNum3) || (cardNum1 == cardNum4) && (cardNum2 == cardNum5)
        || (cardNum1 == cardNum5) && (cardNum2 == cardNum3) || (cardNum1 == cardNum5) && (cardNum2 == cardNum4) || (cardNum2 == cardNum3)
        && (cardNum1 == cardNum4) || (cardNum2 == cardNum3) && (cardNum1 == cardNum5) || (cardNum2 == cardNum3) && (cardNum4 == cardNum5)){
            System.out.println ("You have two pairs!");
        }
        else if (cardNum1 == cardNum2 || cardNum1 == cardNum3 || cardNum1 == cardNum4 || cardNum1 == cardNum5 || cardNum2 == cardNum3 || 
        cardNum2 == cardNum4 || cardNum2 == cardNum5 || cardNum3 == cardNum4 || cardNum3 == cardNum5 || cardNum4 == cardNum5){
            System.out.println ("You have a pair!");
        }
        else{
            System.out.println ("You have a high card hand!");
        }
    }
}