package week12;

/**
 *
 * @author Courtney
 * d
 */

//class for donuts which contains the anem fo the donut and
//percent eaten and two method to simulate eating and
//get the reamining percent of donut eaten
public class Donut {
    //the two member vars we have are name of donut and percent eaten
    public String name;
    public int percEaten = 100;
    
    //first method that takes the entered bite size and subtracts amount from 
    //remaining percent of donut then displays the bite size
    public void simulateEating(int biteSize){
        percEaten -= biteSize;
    } // end of method simulateEating
    
    //secind method gets the remaining percent of donut not eaten yet
    public int getPercRemaining(){
        return percEaten;
    }
}
