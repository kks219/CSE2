/*Kelly Skewis
10/6/15
hw 06 */

import java.util.Scanner;

public class BarGraph{
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner (System.in);
        //user input
        System.out.print ("Enter your expenses for Monday: $");
            if (!myScanner.hasNextDouble()){
                myScanner.next();
                System.out.print ("Sorry, you didn't enter an integer. Try Again: ");
            }
            double mondayCost = myScanner.nextDouble ();
        System.out.print ("Enter your expenses for Tuesday: $");
            if (!myScanner.hasNextDouble()){
                myScanner.next();  
                System.out.print ("Sorry, you didn't enter an integer. Try Again: ");
            }
            double tuesdayCost = myScanner.nextDouble ();   
        System.out.print ("Enter your expenses for Wednesday: $");
            if (!myScanner.hasNextDouble()){
                myScanner.next();
                System.out.print ("Sorry, you didn't enter an integer. Try Again: ");
            }
            double wednesdayCost = myScanner.nextDouble ();
        System.out.print ("Enter your expenses for Thursday: $");
            if (!myScanner.hasNextDouble()){
                myScanner.next();
                System.out.print ("Sorry, you didn't enter an integer. Try Again: ");
            }
            double thursdayCost = myScanner.nextDouble ();
        System.out.print ("Enter your expenses for Friday: $");
            if (!myScanner.hasNextDouble()){
                myScanner.next();
                System.out.print ("Sorry, you didn't enter an integer. Try Again: ");
            }
            double fridayCost = myScanner.nextDouble ();
        System.out.print ("Enter your expenses for Saturday: $");
            if (!myScanner.hasNextDouble()){
                myScanner.next();
                System.out.print ("Sorry, you didn't enter an integer. Try Again: ");
            }
            double saturdayCost = myScanner.nextDouble ();
        System.out.print ("Enter your expenses for Sunday: $");
            if (!myScanner.hasNextDouble()){
                myScanner.next();
                System.out.print ("Sorry, you didn't enter an integer. Try Again: ");
            }
            double sundayCost = myScanner.nextDouble ();
        
        int counter = 0;
        //Monday
        String monday= "";
        while (counter < mondayCost){
            monday = monday + "*";
            counter++;
        }
        System.out.println ("Mon:" + monday);
        //Tuesday
        counter = 0;
        String tuesday = "";
        while (counter < tuesdayCost){
            tuesday = tuesday + "*";
            counter++;
        }
        System.out.println ("Tues:" + tuesday);
        //Wednesday
        counter = 0;
        String wednesday = "";
        while (counter < wednesdayCost){
            wednesday = wednesday + "*";
            counter++;
        }
        System.out.println ("Wed:" + wednesday);
        //Thursday
        counter = 0;
        String thursday = "";
        while (counter < thursdayCost){
            thursday = thursday + "*";
            counter++;
        }
        System.out.println ("Thur:" + thursday);
        //Friday
        counter = 0;
        String friday = "";
        while (counter < fridayCost){
            friday = friday + "*";
            counter++;
        }
        System.out.println ("Fri:" + friday);
        //Saturday
        counter = 0;
        String saturday = "";
        while (counter < saturdayCost){
            saturday = saturday + "*";
            counter++;
        }
        System.out.println ("Sat:" + saturday);
        //Sunday
        counter = 0;
        String sunday = "";
        while (counter < sundayCost){
            sunday = sunday + "*";
            counter++;
        }
        System.out.println ("Sun:" + sunday);
        
        //Weekly Average
        double average = ((mondayCost + tuesdayCost + wednesdayCost + thursdayCost + fridayCost + saturdayCost + sundayCost)/7);
        System.out.println ("Your average daily expenses are: " + average);
        double percentage = (average * (double) (Math.random() * .21));
        int num = (int) Math.random () * 2;
        if (num == 0){
            System.out.println ("Estimated expenditure for 4 years: " + (average + percentage)* 52 * 4);
        }
        else{
            System.out.println ("Estimated expenditure for 4 years: " + (average - percentage)* 52 * 4);
        }
    }
}