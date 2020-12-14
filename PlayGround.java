package week5;

/**
 *
 * @author Courtney
 */

import java.util.Random;
public class PlayGround {
    public static void main(String[] args) {
        final int UPPER_EMD_OF_RANGE = 100;
        
        Random rand = new Random();
        //generate random num w/ call to nextint()
        int randNum = rand.nextInt(UPPER_EMD_OF_RANGE);
        
        System.out.println("Random Number: " + randNum);
    } // end of MM
} // end of class playground
