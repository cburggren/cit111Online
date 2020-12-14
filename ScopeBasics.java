package week10;

/**
 *
 * @author courtney
 */

public class ScopeBasics {
    
    //first variable that can be read from and written to by any 
    //code in the class, meaning any method not just the main
    private static String classScopedVar = "All methods can access me!";
       
    //this method demonstrates which variables can be
    //accessed in its local scope: only class scoped vars 
    // and its own local var called local scope 2
    public static void demonstrateScope(){
        System.out.println("Inside demonstrateScope");
        //declaration and init of a local var 
        String localScope2 = "I'm local to demonstrateScope";
        
        // System.out.println(localScope); // cannot be accessed b/c it was declared in the main method
        
        System.out.println(classScopedVar);
        System.out.println(localScope2);
    } // end of method demonsstrateScope
    
    //the main method can be located anywhere you want, method order
    //w/i a class doesn't effect the execution of the code
    
    public static void main(String[] args) {
        System.out.println("Inside Main Method");
        
        //declare and init local var
        String localScope1 = "I'm local to main";
        
        System.out.println(localScope1);
        System.out.println(classScopedVar);
        // System.out.println(localScope2); // this var is only available in the demonstrateScope method
                                         // where it was declared
                                         
        //call a method that will test variable scope concepts
        demonstrateScope();
    } // end of main mehtod
            
} // end of class ScopeBasics
