/*Kelly Skewis
CSE 2 hw11
Program is based off the sample output given in the homework*/
import java.util.Scanner;

public class CSE2Linear{
    public static void binarySearch (int [] list, int search){
        int low = 0;
        int high = 15;
        int counter = 0;
        while (low <= high){
            int mid = (high + low)/2;
            if (search == list[mid]){
                System.out.println("Grade found");
                counter++;
                break;
            }
            else if (search > list[mid]){
                low = mid + 1;
                counter++;
                continue;
            }
            else if (search < list[mid]){
                high = mid - 1;
                counter++;
                continue;
            }
            if (counter == 15){
                System.out.println("Grade not found!");
            }
        }
        System.out.println("Comparisons used: " + counter);
    }
    public static void linearSearch (int [] list, int search){
        int counter = 0;
        for (int i = 0; i < 15; i++){
            if (list[i] == search){
                System.out.println("Grade found!");
                System.out.println("Comparisons used: " + (i + 1));
                break;
            }
            else{ //used to print if grade was not found
                counter++;
            }
        }
        if (counter == 15){
            System.out.println("Grade not found!");
            System.out.println("Comparisons uses: 15");
        }
    }
    public static int [] randomScramble (int[] list){
        System.out.println("Scrambled:");
            for(int i = 0; i < list.length; i++){
                int temp = 0;
                int j = (int)(Math.random() * (i + 1));
                temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        return list;    
    }
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner(System.in);
        int [] grades; //declare array
        grades = new int [15]; //size of array 
        System.out.println("Please enter 15 integers to represent students' final grades: "); //prompt user
        boolean acceptable = true;
        for (int i = 0; i < 15; i++){
            while (acceptable){
                if (!myScanner.hasNextInt()){ //determine if input is an integer
                    myScanner.next();
                    System.out.println("ERROR! Please enter an integer: ");
                }
                else{
                    int x = myScanner.nextInt();
                    if (x > 100 || x < 0){ //determine if input is between 0-100
                        System.out.println("ERROR! Please enter a number between 0-100: ");
                        continue;
                    }
                    else{
                        grades[i] = x;
                        if (grades[i] == grades[0]){
                            break;
                        }
                        else if(grades[i] < grades[i - 1]){
                            System.out.println ("ERROR! Please enter a number greater than the first: ");
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }
        for (int k = 0; k < 15; k++){ //print out entire array
            System.out.print (grades[k] + " ");
        }
        System.out.println("Enter a grade to be searched for: ");
        int search = myScanner.nextInt();
        binarySearch(grades, search); //binary search
        randomScramble(grades); //method randomly scrambles objects in array
        for (int i = 0; i <15; i++){
            System.out.print (grades[i] + " ");
        }
        System.out.println ("Enter a grade to be searched for: ");
        int search2 = myScanner.nextInt();
        linearSearch(grades, search2);
    }
}