package week8;

/**
 * **STILL HAS EXTENSIONS**
 * @author Courtney
 * program that transforms 3 units into their equivalent counterparts
 * chosen by the user from hard coded choices
 */

//import scanner
import java.util.Scanner;
public class UnitConverter {
    public static void main(String[] args) {
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt the user to enter in inches to convert to cm
        System.out.println("***BASIC UNIT CONVERTER THAT IS NOT LIKE MAGIC");
        System.out.println("Enter the number of inches to convert to centimeters: ");
        //declare var for inputed inches and store input in it
        double userInches = scan.nextDouble();
        //print conversion by calling method in println
        System.out.println(userInches + " in equals " + convertInchesToCM(userInches) + " cm");
        
        //prompt user to enter tbsp to convert to tsp 
        System.out.println("Enter the number of TBSP to convert to TSP: ");
        //declare var for user input tbsp's and store input in it
        double userTbsp = scan.nextDouble();
        //print conversion by calling tbsp to tsp method in println
        System.out.println(userTbsp + " TBSP equals " + convertTbspToTsp(userTbsp) + " TSP");
        
        //prompt user to enter num f grams they want to convert to ounces
        System.out.println("Enter the number of grams to convert to ounces: ");
        //declare var to hold user input gram and then store input in it
        double userGrams = scan.nextDouble();
        //print conversion using convert grams to ounces method inside println
        System.out.println(userGrams + " grams equals " + convertGramsToOz(userGrams) + " ounces");
        
        //goodbye message
        System.out.println("Goodbye! Hopefull this gave you answers that you could just Google anyways!");
    } // end of main method
    
    //method that converts a length in inches to a length in centimeters
    public static double convertInchesToCM(double inches){
        final double RATE = 2.54;
        return (inches * RATE);
    }
    
    //method that converts table spoons to teaspoons
    public static double convertTbspToTsp(double numTbsp){
        final double RATE = 3;
        return (numTbsp * RATE);
    }
    
    //method that converts grams to ounces
    public static double convertGramsToOz(double grams){
        final double RATE = 0.035274;
        return (grams * RATE);
    }
} // end of class UnitConverter
