package week12;

/**
 *
 * @author chees
 */

//import scanner
import java.util.Scanner;
public class CarLand {
    public static void main(String[] args) {
        //create scanner 
        Scanner scan = new Scanner(System.in);
        //create new instance of a Car object with keyword new
        Car deLorean = new Car();
        //set member variables on the instance of car store in delorean
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        
        //ask for user input
        System.out.println("What year do you want to travel to?");
        deLorean.setDestinationDate(scan.nextInt());
        
        //send car instance to helped method to display stats
        displayCarStats(deLorean);
        
        //test its methods 
        deLorean.startEngine();
        deLorean.accelerate(50);
        deLorean.shiftGearUp();
        displayCarStats(deLorean);
        deLorean.decelerate(40);
        deLorean.shiftGearDown();
        displayCarStats(deLorean);
        
        //check status again
        displayCarStats(deLorean);
        deLorean.stopEngine();
        displayCarStats(deLorean);
    } // end of main method
    
    //method that displays car stats
    public static void displayCarStats(Car anyCar){
        System.out.println("**************************************");
        System.out.println("Stats:");
        System.out.println(anyCar.year + " " + anyCar.makeModel);
        System.out.println("Engine running? " + anyCar.checkEngineStatus());
        System.out.println("Current speed: " + anyCar.getCurrentSpeed());
        System.out.println("Gear: " + anyCar.gear);
        System.out.println("Year traveled to: " + anyCar.fluxCapacity);
        System.out.println("Year we left from: 2020");
        System.out.println("**************************************");
    } // close method displayCaarStats
} // end of class carLand
