package vendingMachineProgram;

/**
 *
 * @author Courtney
 * Class that represents a vending machine that holds and array of candy objcts
 * an array of "buttons" for customers to select, the total cost of the item the person is buying
 * and the position of the candy the person is buying
 * it also has methods that help set different parts of the candy objt array
 * and different values in the class based on user input
 */
public class VendingMachine {
    /**
     * member variables used to do functions of vending machine
     */
    public Candy[][] candyInArms = new Candy[3][3];
    public String[][] buttonsAvailable = {
        {"A1", "A2", "A3"},
        {"B1", "B2", "B3"},
        {"C1", "C2", "C3"}
    };
    public double totalCost;
    public int[] selectedPosition = new int[2];
    
    //test method that initializes candy objts in this class
    public void setUpCandyObjts(){
        for (int r = 0; r < 3; r++){
            for (int c = 0; c < 3; c++){
                candyInArms[r][c] = new Candy();
            } // end of internal for loop
        } // end of for loop
    } // end of method setUpCandyObjts
   
    //method that sets the names of the candy in the vending machine
    public void setCandyNamesInArms(int r, int c, String input){
         candyInArms[r][c].setCandyName(input);
    } // end of method setCandyNamesInArms           
    
    //method that sets selected candy based on inputed row and column
    public void setSelectedCandy(int r, int c){
        selectedPosition[0] = r;
        selectedPosition[1] = c;
        candyInArms[r][c].isSelected = true;
    } // end of method setSelectedCandy
    
    //method that sets the cost of each piece of candy that will display
    public void setCandyPrice(int r, int c, double inputCost){
        candyInArms[r][c].setCandyCost(inputCost);
    } // end of method setCandyCost
    
    // method that tests to see which candy is selected and sets 
    //vending machines total cost based on that amount
    public void setTotalCost(int r, int c){
        if (candyInArms[r][c].isSelected){
            totalCost = candyInArms[r][c].cost;
        }// end of if
    } // end of method setTotalCost
    
    //method that calculates + returns change based on the money inserted and price
    public double calculateChange(double moneyInserted){
        double change;
        change = moneyInserted - totalCost;
        return  change;
    } // end of method calculateChange            
} // end of class VendingMachine
