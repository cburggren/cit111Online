
package week3;

/**
 *
 * @author Courtney
 * this program shows how the ?: operator works
 */
public class ConditionalDemo2 {
    public static void main(String[] args) {
        //declare/initialize variables
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        
        //use ?: to test the initialized var result and assign it a value
        result = someCondition ? value1 : value2;
        
        //print the result
        System.out.println(result);
        
    } //end of main method 
} // end of class ConditionalDemo2
