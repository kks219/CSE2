/*Kelly Skewis
10/6/15
hw06 */

//program asks user for 10 digit ISBN number
//program reads this ISBN number and determines if it is a valid number
import java.util.Scanner;

public class CheckDigit{
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner (System.in);
        char first, second, third, fourth, fifth, sixth, seventh, eigth, ninth, tenth;
        System.out.print ("Enter your 10 digit ISBN number.");
        String ISBN;
        //determine if ISBN is 10 digits long
        do{
        ISBN = myScanner.next ();
        if (ISBN.length() != 10){
            System.out.print ("This is NOT a valid ISBN. Please enter 10 digits: ");
        }
        } while (ISBN.length() != 10);
        //seperate digits of ISBN number
        first = ISBN.charAt (0);
        second = ISBN.charAt (1);
        third = ISBN.charAt (2);
        fourth = ISBN.charAt (3);
        fifth = ISBN.charAt (4);
        sixth = ISBN.charAt (5);
        seventh = ISBN.charAt (6);
        eigth = ISBN.charAt (7);
        ninth = ISBN.charAt (8);
        tenth = ISBN.charAt (9);
        
        int num;
        int checkDigit;
        num = ((first * 10) + (second * 9) + (third * 8) + (fourth * 7) + (fifth * 6) + (sixth * 5) + (seventh * 4) + (eigth * 3) + (ninth * 2));
        if ((char)(num % 11) == tenth){
            System.out.println ("This is a valid ISBN");
        }
        else{
            if ((num % 11) == 10){
                checkDigit = 'X';
            }
            else{
                checkDigit = num % 11;
            }
            System.out.println ("This is not a valid ISBN. Check Digit should be " + checkDigit);
        }
    }
}