/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Courtney
 * this program shows how putting an increment or decrement
 * operator can change the variable when added as a prefix or postfix
 */
public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        //prints 4
        System.out.println(i);
        
        ++i;
        //prints 5
        System.out.println(i);
        
        //this will print 6
        System.out.println(++i);
        
        //this will print 6 for now
        System.out.println(i++);
        
        //now it will print 7
        System.out.println(i);
    } //end of main method
} //end of class PrePostDemo
