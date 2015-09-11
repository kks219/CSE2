//Kelly Skewis
//CSE 2
//program to evenly split the cost of a bill

//scanner
import java.util.Scanner;

//define class
public class Check{
    public static void main (String [] agrs) {
        Scanner myScanner = new Scanner (System.in);
        //prompt user for bill cost
        System.out.print ("Enter the original cost of the check in the form xx:xx: ");
        //accept user input
        double checkCost = myScanner.nextDouble ();
        //prompt user for tip percentage
        System.out.print ("Enter the percentage of tip you want to pay as a whole number (in the form xx) : ");
        double tipPercent = myScanner.nextDouble ();
        tipPercent /= 100;
        //prompt user for number of people that went to dinner
        System.out.print ("Enter the number of people who went out to dinner:");
        int numPeople = myScanner.nextInt ();
        
        //output
        double totalCost;
        double costPerPerson;
        int dollars; //whole dollar amount
        int dimes; //cents
        int pennies;
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost/numPeople;
        dollars = (int)costPerPerson;
        dimes= (int)(costPerPerson * 10) % 10;
        pennies = (int)(costPerPerson * 100) % 10;
        //final output
        System.out.println ("Each person owes " + dollars + '.' + dimes + pennies);
        
        
    }
}

