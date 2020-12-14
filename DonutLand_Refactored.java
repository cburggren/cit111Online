package week12;

/**
 *
 * @author courtney
 * uses the donut class to create 2 objects and set a name and percent eaten
 * then passes a hard coded value of bite size into the object's methods to
 * get the remaining percent
 */
public class DonutLand_Refactored {
    public static void main(String[] args) {
        //create our 2 donut objects
        Donut_Refactored donut1 = new Donut_Refactored();
        Donut_Refactored donut2 = new Donut_Refactored();
        //create finals that set different bite sizes
        final int BITE_SIZE1 = 50;
        final int BITE_SIZE2 = 24;
        // assign them both names to their name member variables
        donut1.name = "Chloe";
        donut2.name = "Watson";
        //assign percents remaining of donut toeach donut obj
        donut1.percEaten = 100;
        donut2.percEaten = 100;
        
        //call the print class data method to see what their values are before
        //simulating eating
        printObjectData(donut1);
        printObjectData(donut2);
        
        // calling the simulate eating method with hard coded bite size
        donut1.simulateEating(BITE_SIZE1);
        // calling the simulate eating method with hard coded bite size
        donut2.simulateEating(BITE_SIZE2 );
        
        //calling printobjectdata method with first object donut and then the second object donut
        printObjectData(donut1);        
        printObjectData(donut2);
    } // end of main method 
    
    //method that accepts a donut object as an input param
    //guts of the method call appropriate methods and access member
    //variables to display all the data inside donut_refactored
    public static void printObjectData(Donut_Refactored donut){
        System.out.println("**************************************");        
        
        System.out.println(donut.name + "'s percent reamining is " 
                + donut.getPercRemaining());
        
        System.out.println("**************************************");
    } // end of method printObjectData
} // end of class DonutLand
