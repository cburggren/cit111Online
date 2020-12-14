
package week3;

/**
 *
 * @author Courtney
 * 
 */

//import scanner for inputting text
import java.util.Scanner;

public class RoadTrip {
    public static void main(String[] args) {
        //declaring and initializing variables
        String carMake = "1996 Mazda Protage";
        String carName = "Nedfry";
        int maxPassengers = 5; 
        int currentNumOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double tripBudget = 300.00;
        double distanceToUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; // declaring this but not initializing it yet
        
        Scanner scan = new Scanner(System.in); //creating scanner to get input
        
        //simulation of the roadtrip
        System.out.println("***Road trip simulator***");
        System.out.println("-->Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers + " passengers.");
        System.out.println("The car's name is " + carName);
        System.out.println("Distance to destination: " + distanceToUtah + " miles.");
        System.out.println("Full car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip.");        
        // made an if statement so that if there is only one passenger, then there will be no S at the end of passenger
        if (currentNumOfPassengers == 1){
            System.out.println("Starting trip with " + currentNumOfPassengers + " passenger.");
        } else {
            System.out.println("Starting trip with " + currentNumOfPassengers + " passengers.");
        } // end of if/else statement
        System.out.println("Destination reached? " + destinationReached);
        
        //calculate leg distance
        legDistance = distanceToUtah * .25;
        
        //incrememnt trip odometer by leg distance
        tripOdometer = tripOdometer + legDistance;
        
        //subtract leg distance from distance to destination 
        distanceToUtah = distanceToUtah - legDistance;
        
        // see a hitch hiker heading west
        System.out.println("You see a hitch hiker heading west! Do you want to pick them up?");
        System.out.println("You have let the hobo- I mean hitch hiker into your car.");
        
        //check if there is room in the car and if so let the hobo in
        if (carFull == false){
        currentNumOfPassengers ++;
        System.out.println("I guess you are picking up this stranger!");
        } else {
            System.out.println("The car is full and you cannot pick up the hobo");
        } //end of if/else statement
        
        //calculate price of gas for 1st leg of journey
        double priceGas = 2.66;
        double mph = 20;
        double temp = (legDistance / mph) * priceGas; // dividing leg disntance by 20 b/c that's my estimated MPG for this car
        
        //deduct gas money from budget
        tripBudget = tripBudget - temp;
        
        //reprint status of variables to console
        System.out.println("***Road trip simulator***");
        System.out.println("-->One-fourth of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers + " passengers.");
        System.out.println("The car's name is " + carName);
        System.out.println("Distance to destination: " + distanceToUtah + " miles.");
        System.out.println("Full car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip.");        
        // made an if statement so that if there is only one passenger, then there will be no S at the end of passenger
        if (currentNumOfPassengers == 1){
            System.out.println("We have " + currentNumOfPassengers + " passenger.");
        } else {
            System.out.println("We have " + currentNumOfPassengers + " passengers.");
        } // end of if/else statement
        System.out.println("Destination reached? " + destinationReached);
        
        // manually set leg distance
        legDistance = 500.0;
        
        //update odometer
        tripOdometer = tripOdometer + legDistance;
        
        // update distance traveled
        distanceToUtah = distanceToUtah - legDistance;
        
        // two hitch hikers are seen
        System.out.println("Here we go again. You see TWO hitch hikers going west.");
        
        //checking to see if car is full first by making sure the boolean is set right
        if (currentNumOfPassengers == 5){
            carFull = true;
        }
        //if statement to see if the car is full if it isn't pick up the pair if it is move on
        if (carFull == false){
            System.out.println("The car is still not full. You have picked up another two drifters. Great.");
            currentNumOfPassengers = currentNumOfPassengers + 2;
        } else {
            System.out.println("The car is full and you must move on without these sketchy people.");            
        } // end of i/else block
        
        // calculate fuel price after this 500 miles
        temp = (legDistance / mph) * priceGas;
        
        //calculate budget after this leg's gas
        tripBudget = tripBudget - temp;
        
        //reprint status of variables to console
        System.out.println("-->Half of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers + " passengers.");
        System.out.println("The car's name is " + carName);
        System.out.println("Distance to destination: " + distanceToUtah + " miles.");
        System.out.println("Full car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip.");        
        // made an if statement so that if there is only one passenger, then there will be no S at the end of passenger
        if (currentNumOfPassengers == 1){
            System.out.println("We have " + currentNumOfPassengers + " passenger.");
        } else {
            System.out.println("We have " + currentNumOfPassengers + " passengers.");
        } // end of if/else statement
        System.out.println("Destination reached? " + destinationReached);
        
        //last part of the trip so calculate the remaining distance to destination
        legDistance = distanceToUtah;
        
        distanceToUtah = 0;
        //calculate trip odometer
        tripOdometer = tripOdometer + legDistance;
        
        // two more hitch hiker are seen
        //testing to see if we can fit them if we can then we will continue if not then pass them up
        System.out.println("There seems to be so many hitch hikers going this way. You see two more.");
        System.out.println("Can you pick them up?");
        
        //if the car is not full check to see if we have two seats open
        if(carFull == false){
            System.out.println("The car is not full yet, but can both fit?");
            if (currentNumOfPassengers >= 4){
                System.out.println("There is not enough seats for both people and the couple do not want to be split up, so they pass on your ride offer.");
            } else {
                System.out.println("There is room! Jump on in random strangers!");
            } // end of if/else block
        } else {
            System.out.println("We are at max capacity folks! Sorry!");
        } // end of if/else block
        
        //calculating cost of gas and then remaining budget
        temp = (legDistance / mph) * priceGas;
        tripBudget = tripBudget - temp;
        
        // check to see if we are at the destination
        if (tripOdometer == 1806.0)
            destinationReached = true;
        
        //reprint status of variables to console
        System.out.println("-->End of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers + " passengers.");
        System.out.println("The car's name is " + carName);
        System.out.println("Distance to destination: " + distanceToUtah + " miles.");
        System.out.println("Full car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip.");        
        // made an if statement so that if there is only one passenger, then there will be no S at the end of passenger
        if (currentNumOfPassengers == 1){
            System.out.println("We have " + currentNumOfPassengers + " passenger.");
        } else {
            System.out.println("We have " + currentNumOfPassengers + " passengers.");
        } // end of if/else statement
        System.out.println("Destination reached? " + destinationReached);
        
    } // end of main method
} // end of class RoadTrip
