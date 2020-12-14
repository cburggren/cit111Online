package week8;

/**
 *
 * @author Courtney
 *a program used to calculate the area or volume of selected 
 * shape chosen by a user and output those answers
 */

//import scanner
import java.util.Scanner;
public class GeometricShapes {
    public static void main(String[] args) {
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt user to enter in the side of a cube and assign input to cube side var
        System.out.println("Please enter the side length of a cube to calculate its volume: ");
        double cubeSide = scan.nextDouble();
        //use input to call method to calc cube vol and display result
        double cubeVol = calculateVolumeCube(cubeSide);
        System.out.println("The volume of a cube with a side length of " + cubeSide + " is: " + cubeVol);
        
        //prompt user to enter in the radius and height of a cylinder and store answer is respective vars
        System.out.println("Please enter the radius of a cylinder: ");
        double cylRadius = scan.nextDouble();
        System.out.println("Please enter the height of the same cylinder: ");
        double cylHeight = scan.nextDouble();
        //use input to call cylinder volume method and store result in cyl volume var
        double cylVol = calculateVolumeCylinder(cylRadius, cylHeight);
        System.out.println("The volume of a cylinder with a radius of " + cylRadius + " and a height of " + cylHeight + " is: " + cylVol);
        
        //prompt user to enter in 2 side lengths of trapezoid and height then store input in respective vars
        System.out.println("Please enter the first side of a trapezoid: ");
        double trapSideA = scan.nextDouble();
        System.out.println("Please enter the next side of the same trapezoid");
        double trapSideB = scan.nextDouble();
        System.out.println("Please enter the height of the trapezoid: ");
        double trapHeight = scan.nextDouble();
        //call calculate trapezoid are method to return the area and store in trap area var then output
        double trapArea = calculateAreaTrapezoid(trapSideA, trapSideB, trapHeight);
        System.out.println("The area of trapezoid with the dimensions " + trapSideA + "x" + trapSideB + "x" + trapHeight + " is: " + trapArea);
    } // end of main method
    
    //method that calculates the volume of a cube
    public static double calculateVolumeCube(double sideLength){
        double volume = sideLength * sideLength * sideLength;
        return volume;
    } // end of method CalculateVolumeCube
    
    //method that calculates the volume of a cylinder
    public static double calculateVolumeCylinder(double radius, double height){
        final double PI = 3.14159;
        double volume = PI * (radius * radius) * height;
        return volume;
    } // end of method calculateVolumeCylinder
    
    //method that calculates the area of a trapezoid
    public static double calculateAreaTrapezoid(double sideLengthA, double sideLengthB, double height){
        double area = ((sideLengthA + sideLengthB) / 2) * height;
        return area;
    } // end of method calculateAreaTrapezoid
} // end of class GeometricShapes
