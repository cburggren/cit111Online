package week6;

/**
 *
 * @author Courtney Burggren
 * a project that asks several questions, and based on user input
 * scores the input based on hard coded answers about what matters to me 
 * in friendship. Then, it displays the score and decides if we can be friends or not
 */

//imports scanner
import java.util.Scanner; 
public class MightWeBeFriends {
    public static void main(String[] args) {
        //declare/initialize variables for user input, a minimum score
        //needed to be your frined, and create scanner
        final int MIN_SCORE = -10;
        final int YES = 1;
        int userScore = 0;
        int userAnswer;
        Scanner scan = new Scanner(System.in);
        
        //styling the first lines out output to look nice
        System.out.println("**********Might We Be Friends?**********");
        System.out.println("For the following questions, please select 1 for yes and 0 for no, then press enter: ");
        
        //prompt user for questions and get their answer
        System.out.println("Do you like video games?");
        userAnswer = scan.nextInt();
        
        //if the answer is yes, add +10 to score, if not take away 10
        if (userAnswer == YES){
            userScore = userScore + 10;
        } else {
            userScore = userScore - 10;
        } // end of if/else
        
        //prompt user, get input, test to see what their answer was and give points based on answer
        System.out.println("Do you like makeup?");
        userAnswer = scan.nextInt();
        
        if (userAnswer == YES){
            userScore += 10;
        } else {
            userScore -= 10;
        } // end of i/else
        
        System.out.println("Are you weird?");
        userAnswer = scan.nextInt();
        
        if (userAnswer == YES){
            userScore += 10;
        } else {
            userScore -= 10;
        } // end of if/else
        
        System.out.println("Do you like animals?");
        userAnswer = scan.nextInt();
        
        if (userAnswer == YES){
            userScore += 10;
        } else {
            userScore -= 10;
        } // end of if/else
        
        System.out.println("Are you a girl?");
        userAnswer = scan.nextInt();
        
        //if they say yes, then they will go down a different path than if they say no
        //determine the answer and use nested if's to go down right path
        if (userAnswer == YES){
            //prompt next question down "girl" path
            System.out.println("Do you think pink is a dumb color because it's traditionally girly?");
            userAnswer = scan.nextInt();
            //if they replied yes, then change score as needed, if they say no, then change points too
            if (userAnswer == YES){
                userScore -= 15;                         
            } else {
                userScore += 10;               
            } //end of nested if/else
        } else {
            //prompt question and move forward down a different path if yes than if no, using if's
            System.out.println("Are you a feminist?");
            userAnswer = scan.nextInt();            
            if (userAnswer == YES){
                userScore += 10;
            } else {
                //ask another question and go down another path if answer is no
                System.out.println("Is it because feminism usually leaves out women of color and mostly profits white women?");
                userAnswer = scan.nextInt();
                if (userAnswer == YES){
                    userScore += 20;
                } else {
                    userScore -= 40;
                } //end of nested if/else
            } //end of nested i/else
        } //end of if/else
        
        //prompt for last question and determine if they get point or not with if
        System.out.println("Did you wear a mask during quarantine?");
        userAnswer = scan.nextInt();
        
        if (userAnswer == YES){
            userScore += 10;
        } else {
            userScore -= 15;
        } // end of if/else
        
        //determine if the score is above or below min score needed for friendship
        System.out.println("**********************************");
        System.out.println("Your final score is: " + userScore);
        System.out.println("**********************************");
        if (userScore >= MIN_SCORE){
            System.out.println("Yay! You seem like a generally okay person! Let's be friends!");
        } else {
            System.out.println("Sorry, but I'm just not looking for friends right now. It's not you, it's me.");
        }
    } // end of the main method
} // end of class MightWeBeFriends
