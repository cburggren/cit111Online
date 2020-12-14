package week5;

/**
 *
 * @author Courtney
 * to show what happens without a break statement in a switch block
 */
public class SwithcDemo2 {
    public static void main(String[] args) {
        int month = 6;
        int year = 2000;
        int numDays = 0;
        
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> numDays= 31;
            case 4, 6, 9, 11 -> numDays = 30;
            case 2 ->  {
                if (((year % 4 == 0) && !(year % 100 ==0)) || (year % 400 == 0))
                numDays = 29;
                else
                numDays = 28;
            }
            default ->  System.out.println("Invalid Month");        
        } // end of switch block
        System.out.println("Number of days = " + numDays);
       
    } //end of main method
} // end of class SwitchDemoFall Through

