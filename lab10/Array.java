import java.util.Scanner;

public class Array{
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner (System.in);
        int x = (int)(Math.random() * 5) + 5;
        String [] students;
        students = new String [x];
        System.out.println ("Please enter the names of " + x + " students: ");
        for (int i = 0; i < x; i++){
            String studentName = myScanner.next();
            students [i] = studentName;
        }
        int [] midterm;
        midterm = new int [x];
        for (int j = 0; j < x; j++){
            int grade = (int)(Math.random() * 101);
            midterm [j] = grade;
        }
        System.out.println ("Here are the midterm grades for the " + x + " students above.");
        for (int k = 0; k < x; k++){
            System.out.println (students [k] + " : " + midterm [k]);
        }
        
    }
}