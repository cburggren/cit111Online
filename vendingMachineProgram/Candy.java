package vendingMachineProgram;

/**
 *
 * @author courtney
 * class of candy that allows for candy name and cost to be set individually
 * and a bool to test if the candy was selected
 * has methods to set the name of candy and also set the cost 
 */


public class Candy {
    //member variables used to store the name of the candy, cost of the candy
    // and the remaining stock of the candy (set to 5 when initialized)
    public String name;
    public double cost;
    public boolean isSelected = false;
    
    //method to set the name of the candy
    public void setCandyName(String inputName){
        name = inputName;
    } // end of method setCandyName
    
    // method that sets the candy cost
    public void setCandyCost(double inputCost){
        cost = inputCost;
    } // end of method setCandyCost
} // end of class Candy
