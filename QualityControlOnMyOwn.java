package week5;

/**
 *
 * @author courtney
 */

//import random generator
import java.util.Random;
public class QualityControlOnMyOwn {
    public static void main(String[] args) {
        //cdeclare vars
        final int MAX_SCORE = 100;
        final int THRESH = 50;
        final int CONTROL = 10;
        double unitCount = 0;        
        double numFail = 0;
        int score;
        int consecFails = 0;
        final int SHUTDOWN = 4;
        double average = 0;
        
        
        //import RNG
        Random rand = new Random();
        
        //while less than 10 loops occur, get a quality score
        //from each "unit" and display that, whether they passed,
        //and how many have passed an failed so far
        while (unitCount < CONTROL){            
            //assign score from RNG
            score = rand.nextInt(MAX_SCORE);
            System.out.println("Unit Quality: " + score);
            //if score is better than threshold display that 
            //if not, display fail then show failures out of units total
            if (score >= THRESH){                                
                System.out.println("Unit passes quality test");  
                consecFails = 0;
            } else {
                numFail++;                
                System.out.println("Unit below quality standards!"); 
                consecFails++;
            } // end of if/else
            unitCount++;
            average = score / unitCount;
            if (consecFails > SHUTDOWN){
                System.out.println("***ATTENTION! MACHINE MUST BE RESET. TOO MANY CONSECUTIVE FAILURES***");
                break;
            } // end of if            
            System.out.println("Total failures: " + numFail + " out of " + unitCount + " units made");
            System.out.println("Average quality score: " + average);            
            System.out.println("********************");
                        
        } // end of while loop
        //display final results
        System.out.println("***PRODUCTION SUMMARY***");
        System.out.println("Tested " + unitCount + " units.");
        System.out.println("Failure Ratio: " + (numFail / unitCount));
    } //end of MM
} //end of class qualitycontrolonmyown
