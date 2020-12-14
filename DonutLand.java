package week12;

/**
 *
 * @author courtney
 * uses the donut class to create 2 objects and set a name and percent eaten
 * then passes a hard coded value of bite size into the object's methods to
 * get the remaining percent
 */
public class DonutLand {
    public static void main(String[] args) {
        //create our 2 donut objects
        Donut donut1 = new Donut();
        Donut donut2 = new Donut();
        // assign them both names to their name member variables
        donut1.name = "Chloe";
        donut2.name = "Watson";
        //assign percents remaining of donut toeach donut obj
        donut1.percEaten = 100;
        donut2.percEaten = 100;
        
        //display the first donut's object's percent eaten when create
        System.out.println("When first created, " + donut1.name 
                + "'s percent remaining is " + donut1.percEaten);
        
        System.out.println("**************************************");
        // calling the simulate eating method with hard coded bite size
        donut1.simulateEating(12);
        
        System.out.println("**************************************");
        
        System.out.println("After being eaten, " + donut1.name 
                + "'s percent reamining is " + donut1.getPercRemaining());
        
        System.out.println("**************************************");
    } // end of main method 
} // end of class DonutLand
