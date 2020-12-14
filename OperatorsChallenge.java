/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author chees
 */
public class OperatorsChallenge {
    public static void main(String[] args) {
        //declaring and initializing variables
        int a = 100;
        int b = 2000;
        double d = 10.5;
        String line1 = "Go Ask Alice";
        String line2 = "I think she'll know";
        //storing result of dividing b by a in variable r
        int r = b / a;
        
        //print out the result of r
        System.out.println("b divided by a is: " + r);
        
        // storing the remainder of b divided by a in variable mod
        int mod = b % a;
        
        //print out result of mod
        System.out.println(" b % a is: " + mod);
        
        //creating a variable rd and store in it mod times d then print
        double rd = mod * d;
        System.out.println("The value of rd is: " + rd);
        
        // adding 5 to value of a and storing it in a
        a = a + 5;
        
        // printing that we are going to take mod of b and a
        System.out.println("We are about to compute the value of " + b + " mod " + a);
        
        //storing b mod a in rd then printing it
        rd = b % a;
        System.out.println("The value of rd is: " + rd);
        
        //print out lin1 and line2 concatenated forwards and backwards
        System.out.println(line2 + " " + line1);
        System.out.println(line1 + " " + line2);                              
    } // end of main method
} // end of class OperatorsChallenge
