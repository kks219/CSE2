//Kelly Skewis
//September 4, 2015
//CSE 2
//Cyclometer

//define class
public class Cyclometer{
    public static void main (String [] args){
        int secsTrip1= 480; //seconds trip 1
        int secsTrip2= 3220; //seconds trip 2
        int countsTrip1= 1561; //rotations trip 1
        int countsTrip2= 9037; //rotations trip 2
        
        double wheelDiameter= 27.0, //wheel diameter
        PI= 3.14159, //value of pi
        feetPerMile = 5280, //feet in a mile
        inchesPerFoot = 12, //inches in a foot
        secondsPerMinute = 60; //seconds in a minute
        
        double distanceTrip1, distanceTrip2, distanceTotal; //declare variables
        
        //print information
        System.out.println ("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + (countsTrip1) +" counts.");
        System.out.println ("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + (countsTrip2) +" counts.");
        
        //calculations of distances
        distanceTrip1= countsTrip1*wheelDiameter*PI; //distance in inches
        distanceTrip2= countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        distanceTrip1/= inchesPerFoot*feetPerMile; //distance in miles
        distanceTotal= distanceTrip1+distanceTrip2;
        
        //print distances
        System.out.println ("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println ("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println ("The Total distance was "+distanceTotal+"  miles.");
        
    }
}