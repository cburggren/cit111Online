package week5;

/**
 * **this has extensions to do later maybe
 * @author Courtney
 * have user solve math problem hard coded in
 * if the answer is right congratulate them
 * if they're incorrect let them know if the input was 
 * higher or lower than the answer and have them try again
 * after 3 incorrect attempts display right answer and how to find it
 */

//import scanner
import java.util.Scanner;
public class MathProblem {
    public static void main(String[] args) {
        //initialize/delcare the answer to the math problem, and num of tries
        // declare the user input answer
        final int MATH_ANSWER = 7;
        final String MATH_PROBLEM = "(((10 * 9) / 2) + 4) / 7 ";
        int userAnswer;
        int numTries = 1;
        
        //create Scanner
        Scanner scan = new Scanner(System.in);
        
        //show user math problem then prompt them for answer
        System.out.println("Please solve the following math problem: ");
        System.out.println(MATH_PROBLEM);
        System.out.println("Please write your answer as a whole number");
        
        while (numTries <= 3){
            userAnswer = scan.nextInt();
            //if the answer is right, congratulate
            //if not, they get 2 more tries to get it right
            if (userAnswer == MATH_ANSWER){
                System.out.println("Yay! You got the answer right! You'rea genius! Or at least as smart as a 7th grader!");
                break;
            } else {
                System.out.println("That was wrong.");
                //if answer is higher tell them it's higher if lower tell them its lower
                if (userAnswer > MATH_ANSWER){
                    System.out.println("Your answer is higher than the correct one.");
                } else {
                    System.out.println("Your answer is lower than the correct one");
                }
            }
            numTries++;
            if (numTries > 3) {
                System.out.println("Sorry you did not get the answer in the necessary attempts.");
                System.out.println("The answer was " + MATH_ANSWER);
                System.out.println("This was achieved by multiplying 10 * 9, then dividing that number by 2. Then, add 4 to that number, and finally, divide that number by 7.");
            } // end of if
        } // end of while loop
        
    } // end of main method
} // end of class MathProblem
