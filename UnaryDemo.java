
package week3;

/**
 *
 * @author Courtney
 * this program looks at how unary operators effect variables
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int result = +1;
        //result is 1
        System.out.println(result);
        
        result--;
        //result is now 0
        System.out.println(result);
        
        result++;
        //result is now 1
        System.out.println(result);
        
        result = -result;
        //result is now switched to -1
        System.out.println(result);
        
        boolean success = false;
        //success is false
        System.out.println(success);
        //this will print true
        System.out.println(!success);
    } // end of main method
} //end of class UnaryDemo
