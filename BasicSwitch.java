package week7;

/**
 *
 * @author courtney
 * demonstrates the most essential functionality of a switched block
 */
public class BasicSwitch {
    public static void main(String[] args) {
        //hard coded value to test switch functionality
        final int SELECT = 2;
        
        //match the value of select to a case's value and execute
        //the code in that case until a break is encountered
        switch(SELECT){
            case 1 -> System.out.println("First case");
            case 2 -> System.out.println("Second case");
            case 78 -> System.out.println("Cases can match any int value");
            default -> System.out.println("Default case");
        }//any pass through that doesn't hit any of the other switches hits here
        // end of switch
        
        //doing the same thing with if/else
        if (SELECT == 1){
            System.out.println("If 1");
        } else if (SELECT == 2){
            System.out.println("If 2");            
        } else if (SELECT == 78){
            System.out.println("If 78");
        } else {
            System.out.println("If Default");
        } // end of if/else
    } // end of main method
} // end of class BasicSwitch
