
package week3;

/**
 *
 * @author Courtney
 * this program is showing how to use the instanceof operator
 */
public class InstanceofDemo {
    public static void main(String[] args) {
        // declare the objects
        Parent objt1 = new Parent();
        Parent objt2 = new Child();
        
        //check instanceof and print results
        System.out.println("objt1 instanceof Parent: " + (objt1 instanceof Parent));
        System.out.println("objt1 instanceof Child: " + (objt1 instanceof Child));
        System.out.println("objt1 instanceof MyInterface: " + (objt1 instanceof MyInterface));
        System.out.println("objt2 instanceof Parent: " + (objt2 instanceof Parent));
        System.out.println("objt2 instanceof Child: " + (objt2 instanceof Child));
        System.out.println("objt2 instanceof MyInterface: " + (objt2 instanceof MyInterface));
    } //end of main method
} // end of class InstanceofDemo
    //creating the parent and child classes and the interface
    class Parent {}
    class Child extends Parent implements MyInterface {}
    interface MyInterface {}