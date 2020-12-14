package week4;

/**
 *
 * @author Courtney
 * password checking program
 * get user input and compare username and password
 * to set strings to see if they are the same
 */

//import scanner
import java.util.Scanner;
public class UsernameAndPassword {
    public static void main(String[] args) {
        //declare password and username and initialize
        final String USERNAME = "javaghost";
        final String PASSWORD = "ic0d3";
        
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //declare/initialize user input variables after prompitng
        System.out.println("Enter your username then hit enter");
        String inputName = scan.next();
        System.out.println("Enter your password then hit enter");
        String inputPass = scan.next();
        
        //evaluate password and username to see if they match the set ones
        if (inputName.equals(USERNAME) && inputPass.equals(PASSWORD)){
            System.out.println("Authentication successful! You have logged into nthing!");
        } else
            System.out.println("Authentication failed! This attempt will not be recorded");
    } // end of main method
} // end of class UsernameAndPassword
