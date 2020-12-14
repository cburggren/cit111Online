package week12;

/**
 *
 * @author courtney
 * class that holds member cars like if the icecream has sprinkles,
 * is in a bowl or cone, the flavor, and melt state. has method to calculate
 * the percent eaten after bite is passed through and one to change 
 * not melted to melted
 */
public class IceCream {
    public boolean hasSprinkles;
    public boolean inCone;
    public String flavor;
    public boolean melted = false;
    public int percEaten = 100;
    
    //method that calculates and returns percent eaten after bite is taken
    public int percentRemain(int bitesize){
        percEaten -= bitesize;
        return percEaten;
    } // end of method percentRemain
    
    //method that toggles melted bool to true when called and displays sad message
    public void meltIceCream(){
        melted = true;
        System.out.println("Uh oh! Looks like your icecream has melted! Too bad!");
    } // end of method meltIceCream
} // end of class IceCream
