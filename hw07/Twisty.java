/*Kelly Skewis
hw07*/

import java.util.Scanner;

public class Twisty{
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner ( System.in );
        int length = 0;
        boolean acceptable = true;
        System.out.print("Input your desired length: ");
            while (acceptable = true){
                if (!myScanner.hasNextInt()){
                    myScanner.next();
                    System.out.println("Error: Please type in an integer. ");
                    System.out.print("Input your desired length: ");
                }
                else if (myScanner.hasNextInt()){
                length = myScanner.nextInt();
                    if (length <= 0 || length > 80) {
                    System.out.println("    Error: Please enter an integer between the numbers 0-80.");
                    System.out.print("Input your desired length: ");
                    continue;
                    }
                acceptable = false;    
                break;
                
                }
            }
        int width = 0;
        acceptable = true;
        System.out.print("Input your desired width: ");
            while (acceptable = true){
                if (!myScanner.hasNextInt()){
                    myScanner.next();
                    System.out.println("Error: Please type in an integer. ");
                    System.out.print("Input your desired width: ");
                }
                else if (myScanner.hasNextInt()){
                width = myScanner.nextInt();
                    if (width > length){
                    System.out.println("Error: Please input an integer smaller than the length. ");
                    System.out.print("Input your desired width: ");
                    continue;
                    }
                acceptable = false;    
                break;
                
                }
            }
        double xNum = length/width;
        int k;
        int i, j;
    for (i = 0; i < width; i ++){ //determines which line you are writting on
        for(k = 0; k < (xNum + 1); k++){ //determines which character each 'X' will start with
            if(k%2 != 0){
                if (k == xNum){
                    for (j = 0; j < (length % width); j++){
                        if (j == i){
                            System.out.print ("\\");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("#");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                }
                else{
                    for (j = 0; j < width; j++){ //determines which character is written
                        if (j == i){
                            System.out.print ("\\");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("#");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                }
            }
            else{
                if (k == xNum){
                    for (j = 0; j < (length % width); j++){
                        if (j == i){
                            System.out.print ("\\");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("#");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                    
                }
                else{
                    for (j = 0; j < width; j++){
                        if (j==i){
                            System.out.print ("#");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("/");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                }
                }
        }
        System.out.println ("");
    }
    }
}