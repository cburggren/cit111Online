
package week3;

/**
 *
 * @author Courtney
 * this program shows how equality and relational operators
 * work on variables
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        //declare and initialize variables
        int value1 = 1;
        int value2 = 2;
        
        //use if statements to see how the values relate
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    } // end of main method
} // end of class ComparisonDemo
