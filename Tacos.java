package week12;

/**
 *
 * @author courtney
 * class that defines member variables to hold 
 * boolean values of whether the taco includes cheese, tomatoes, lettuce
 * a string that  holds if there is a hard shell or soft shell and int for precent of taco eaten
 * there is 2 methods, one that calculates percent of taco eaten after
 * bite is ran through, and one that changes shell from hard to soft
 */
public class Tacos {
    public boolean includesCheese;
    public boolean includesTomatos;
    public boolean includesLettuce;
    public int percRemain = 100;
    public String shellType = "hard";
    
    //takes in bite size and returns the amount left
    public int percentRemainging(int bite){
        percRemain -= bite;
        return percRemain;        
    } // end of method percentRemaining
    
    //method that changes shell type to soft, cheese to true lettuce to 
    //true and tomatoes to flase if called
    public void makeCourtneyStyle(){
        shellType = "soft";
        includesCheese = true;
        includesLettuce = true;
        includesTomatos = false;
    } // end of method makeCourtneyStyle
} // end of class Tacos
