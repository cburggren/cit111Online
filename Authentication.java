package week5;

/**
 *
 * @author courtney
 * program prompts user for password and displays if they got it 
 * right or wrong, counts the attempts and quits if user exhausts
 * attempts
 * **Possible last extension idea
 */

//import scanner
import java.util.Scanner;
public class Authentication {
    public static void main(String[] args) {
        //delcare and init variables 
        final int REMAIN_ATTEMPTS = 5;
        int numAttempts = 1;
        final String PASSWORD = "cheese";
        String userInput;
        final String SECRET = "I want icecream!";
        final int CODE = 1234;
        int userCode;
        String securityLog = "";
        int logCount = 1;
        
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //while loop that prompts user to put in password
        //controlled by remaining attemps
        while (numAttempts <= REMAIN_ATTEMPTS){
            //prompt user 
            System.out.println("Please enter your password, then hit enter: ");
            userInput = scan.next();
            
            //if the user enters a correct password, they get in, if not 
            //attempts are decreased by 1 and they have to try again
            if (userInput.equals(PASSWORD)){
                    //display next auth step prompt
                    System.out.println("Please enter in the 4 digit code sent to your phone then hit enter: ");
                    userCode = scan.nextInt();
                    //if usercode is the same as the final code then they get in. else, 
                    //they go back through loop with 1 less attempt
                    if (userCode == CODE){
                        System.out.println("Congrats! You have entered the correct password! The secret of the day is: '" + SECRET + "'");
                        break;
                    } else {
                        System.out.println("You have entered the wrong phone code. Please start process again.");
                    } // close if/else                
            } else {
                System.out.println("You have entered the wrong password.");
                System.out.println("You have " + (REMAIN_ATTEMPTS - numAttempts) + " attempts left.");
                //for 3 loops whatever they enter here will be the first log so add it to the log            
                if (logCount < 3){
                    securityLog = securityLog + " " + userInput; 
                } else {
                    securityLog = securityLog + " " + userInput; 
                    System.out.println("Here in the security log: ");
                    System.out.println(securityLog);
                    securityLog = " ";
                    logCount = 0;
                }
                logCount++;

            } // close if/else
            
            if (numAttempts == 5){
                System.out.println("You have no more attempts left. Self destruct sequence in 3..2..1..");
                break;
            }
            numAttempts++;
            
        } // end of while
 
    } //end of main method
} // end of class Authentication
