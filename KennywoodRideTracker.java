package week10;

/**
 * **EXTENSIONS**
 * @author courtney
 * a programs that models people riding thrill and theme rides at
 * Kennnywood
 */

//import RNG
import java.util.Random;
public class KennywoodRideTracker {
    
    //var to store total riders, total failed riders, and total sick riders
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    private final static int MIN_HEIGHT_THRILL = 60;
    private final static int MIN_HEIGHT_THEME = 30;
    
    //method
    public static void rideBlackWidow(int riders, int avgHeight){
        if (avgHeight >= MIN_HEIGHT_THRILL){
            System.out.println("Riding black widow!");
            totalRiders += riders;
            Random r = new Random();
            totalSickRiders += r.nextInt(totalRiders);
        } else{
            totalFailedRideAttempts += riders;
            System.out.println(totalFailedRideAttempts + " turned away crying! Too short!");
        } // end of if/else
    } // end of method rideBlackWidow
    
    //method
    public static void rideMerryGoRound(int riders, int avgHeight){
        if (avgHeight >= MIN_HEIGHT_THEME){
            System.out.println("Riding Merry Go Round!");
            totalRiders += riders;
            Random r = new Random();
            totalSickRiders += r.nextInt(totalRiders);
        } else{
            totalFailedRideAttempts += riders;
            System.out.println(totalFailedRideAttempts + " turned away crying! Too short!");
        } // end of if/else
    } // end of method rideMerryGoRound
    
    //method
    public static void printRideStats(){
        System.out.println("*******Rider STATS*******");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRideAttempts);
        System.out.println("Total Sick Riders: " + totalSickRiders);
        System.out.println("*************************");
    } // end of method printRideStats
    
    public static void main(String[] args) {
        printRideStats();
        rideBlackWidow(10, 60);
        printRideStats();
        rideMerryGoRound(20, 45);
        printRideStats();
        rideBlackWidow(14, 39);
        printRideStats();
        rideMerryGoRound(21, 27);
        printRideStats();
        
    } // end of main method
 
} // end of class KennywoodRideTracker
