package week13;

/**
 *
 * @author courtney
 * creates array of integers puts some values in the array
 * and prints each value to standard output
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //declare array of integers
        int[] anArray;
        
        //allocates memory for 10 integers in the array
        anArray = new int[10];
        
        //initialize first element
        anArray[0] = 100;
        //second element
        anArray[1] = 200;
        //so on
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        
        System.out.println("Elements at index 0: " + anArray[0]);
        System.out.println("Elements at index 1: " + anArray[1]);
        System.out.println("Elements at index 2: " + anArray[2]);
        System.out.println("Elements at index 3: " + anArray[3]);
        System.out.println("Elements at index 4: " + anArray[4]);
        System.out.println("Elements at index 5: " + anArray[5]);
        System.out.println("Elements at index 6: " + anArray[6]);
        System.out.println("Elements at index 7: " + anArray[7]);
        System.out.println("Elements at index 8: " + anArray[8]);
        System.out.println("Elements at index 9: " + anArray[9]);
    } // end of main method
} // end of class ArrayDemo
