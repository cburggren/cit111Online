package week12;

/**
 *
 * @author Courtney
 * class that simulates the cars from back to the future and
 * gives methods to start engine stop engis check engine get current speed 
 * and go faster or slower
 */
public class Car {
    public int year;
    public String makeModel;
    private boolean isEngineRunning = false;
    private double speed;
    public int gear;
    public int fluxCapacity;
    
    //method that starts enging
    public void startEngine(){
        isEngineRunning = true;
        System.out.println("Engine is running.");
    } // end of method startEngine();
    
    //method that stops engine
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("Engine is not running.");
    } // end of method stopEngine
    
    //method that check engine status
    public boolean checkEngineStatus(){
        return isEngineRunning;
    } // end of method checkEngineStatus
    
    //method that get's current speed
    public double getCurrentSpeed(){
        return speed;
    } // end of method getCurrentSpeed
    
    //method that accelerates speed based on input
    public double accelerate(int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
    } // end of method accelerate
    
    //method that decelerates
    public double decelerate(int mphDecrease){
        if (mphDecrease > speed){
            speed = 0;
            System.out.println("The car has stopped because you were dumb and asked to slow down too much.");
        } else {
            speed = speed - mphDecrease;
        } // end of if/else
        return speed;
    } // end of method decelerate
    
    //method to control fluxCapacity destination date
    public void setDestinationDate(int year){
        fluxCapacity = year;
    } // end of method setDestinationDate
    
    //method that displays what year they're now in

    //method to shift gears
    public void shiftGearUp(){
        if (speed >= 15){
            gear = 2;
            System.out.println("Shifting up to 2 at 15mph");
            if (speed >= 35){
                gear = 3;
                System.out.println("Shifting up to 3 at 35mph");
            }//end if if
        } else {
            gear = 1;
        } // end of if/else
    } // end of method shiftGear
    
    //method to shift gears
    public void shiftGearDown(){
        if (speed < 35){
            gear = 2;
            System.out.println("Shifting down to 2 at 15 mphmph");
            if (speed <= 15){
                gear = 1;
                System.out.println("Shifting down to 1 at 10mph");
            }//end if if
        } else {
            gear = 3;
        } // end of if/else
    } // end of method shiftGear
    //method that decreases 
} // end of class Car
