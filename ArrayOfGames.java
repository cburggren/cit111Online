package week13;

/**
 *
 * @author courtney
 * create and array and assign each element a video game title
 * then use for loop to output each element
 */

//import scanner
import java.util.Scanner;
public class ArrayOfGames {
    public static void main(String[] args) {
        //declare array
        String[] videoGames = new String[5];
        
        //assign value to each element in array
        videoGames[0] = "Red Dead Redemption 2";
        videoGames[1] = "Animal Crossing New Horizons";
        videoGames[2] = "The Legend of Zelda Breath of the Wild";
        videoGames[3] = "Fallout New Vegas";
        videoGames[4] = "Dragon Age Origins";
        
        //for loop to display each element
        for (int i = 0; i < 4; i++){
            System.out.println("Game #" + (i + 1) + ": " + videoGames[i]);
        } // end of for loop
        
        
        //call method to ask user what place they want to see
        facilitateUserInteraction(createArray());
    } // end of main method
    
    //method that asks user to view a certain part of the array and outputs it
    public static void facilitateUserInteraction(String[] array){
        //create scanner objt
        Scanner scan = new Scanner(System.in);
        int inputPlace;
        
        
        //do while loop to make sure the input is not below 1 and 
        //above the length of the array
        do {
            //prompt user 
            System.out.println("Enter in the value of the array you want to view. Enter a number between 1 and " + array.length + ": ");
            inputPlace = scan.nextInt();
        } while (inputPlace <= 0 || inputPlace > array.length); // end of do while
        
        
        System.out.println("The value at element " 
                + inputPlace + " is: " + array[inputPlace - 1]);
    } // end of method facilitateuserinteraction
    
    //method that asks the user to create an array and define it's length and what's in each element
    public static String[] createArray(){
        //create scanner
        Scanner scan = new Scanner(System.in);
        //var to put in length and var to put in string
        int arrayLength;
        String userInput;
        
        //do while loop to make sure the user does not enter 0
        do {
            //prompt user to input array length 
            System.out.println("Enter in the length you would like your array to be: ");
            arrayLength = scan.nextInt();
        } while (arrayLength == 0); // end of while look
        
        
        String[] array = new String[arrayLength];
        
        //for loop that prompts user to fill out each array spot and then assigns value to that spot
        for (int i = 0; i < arrayLength; i++){
            System.out.println("Please enter the text you want to show up in the #" + (i + 1) + " spot: ");
            userInput = scan.next();
            //assign spot in array w/ usr text
            array[i] = userInput;
        } // end of for loop
        return array;
    } // end of method create array
} // end of class ArrayOfGames
