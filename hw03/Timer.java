//Kelly Skewis
//CSE 2
//hw03

//scanner
import java.util.Scanner;

//define class
public class Timer{
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner (System.in);
        //prompt user
        System.out.print ("Enter the current time in the form hhmm:");
        //accept user input
        double currentTime = myScanner.nextDouble ();
        //prompt user
        System.out.print ("Enter the time you will be eating dinner in the form hhmm:");
        //accept user input
        double dinnerTime = myScanner.nextDouble ();
        
        //output
        double timeTill;
        int hours;
        int minutes;
        timeTill = dinnerTime - currentTime;
        hours = (int) timeTill/100;
        minutes = (int)(timeTill - (hours * 100));
        //final output
        System.out.println ("You have " + hours + " hours and " + minutes + " minutes until dinner.");
    }
    
}