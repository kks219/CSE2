//Kelly Skewis
//CSE 2
//hw02 Arithmetic Calculations

//define class
public class Arithmetic{
    public static void main (String [] agrs){
        //input variables
        int nSocks= 3; //number of socks
        double sockCost$= 2.58; //cost of socks
        int nGlasses= 6; //number of glasses
        double glassCost$= 2.29; //cost of glasses
        int nEnvelopes= 1; //number of envelopes
        double costEnvelopes$=3.25; //cost of envelopes
        double taxPercent=0.06;
        
        //declare values
        double totalCostSocks$= (nSocks*sockCost$);
        double totalCostGlasses$= (nGlasses*glassCost$);
        double totalCostEnvelopes$= (nEnvelopes*costEnvelopes$);
        double totalCost$= (totalCostSocks$ + totalCostGlasses$ + totalCostEnvelopes$);
        
        //calculate values
        //cost of socks and tax
        System.out.println ("Total cost of socks is " + (totalCostSocks$) + " plus " + (totalCostSocks$*taxPercent) + "tax."); 
        //cost of glasses and tax
        System.out.println ("Total cost of glasses is " + (totalCostGlasses$) + " plus " + (totalCostGlasses$*taxPercent) + " tax.");
        //cost of envelopes and tax
        System.out.println ("Total cost of envelopes is " + (totalCostEnvelopes$) + " plus " + (totalCostEnvelopes$*taxPercent) + " tax.");
        //subtotal without tax
        System.out.println ("The subtotal of all items is " + (totalCost$) + ".");
        //total with tax
        System.out.println ("The total cost, including tax is " + (totalCost$ + (totalCost$*taxPercent)) +".");
        
    }
}
