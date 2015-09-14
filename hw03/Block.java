//Kelly Skewis
//cse 2

import java.util.Scanner;

//define class
public class Block{
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner(System.in);
        //prompt user for input
        System.out.print ("Enter the length of the block:");
        //accept user input
        double blockLength = myScanner.nextDouble ();
        System.out.print ("Enter the width of the block:");
        double blockWidth = myScanner.nextDouble ();
        System.out.print ("Enter the height of the block:");
        double blockHeight = myScanner.nextDouble ();
        
        //output
        double volume;
        double surfaceArea;
        volume = blockLength * blockWidth * blockHeight;
        surfaceArea = 2*(blockWidth * blockLength + blockHeight * blockLength + blockHeight * blockWidth);
        
        //final output
        System.out.println ("The volume of the block with dimensions " + blockLength + " x " + blockWidth + " x " + blockHeight + " is " + volume);
        System.out.println ("The surface area of the block is " + surfaceArea);
    }
}