package week5;

/**
 *
 * @author Courtney
 */
public class NotAsSimpleWhile {
    public static void main(String[] args) {
        //declare/initi vars
        int numLoops = 0;
        
        //create while look
        while(numLoops < 10){
            System.out.println("The value of numLoops is " + numLoops);
            numLoops++;
        } // end of while loop
        
        System.out.println("This is after the while loop.");
    } // end of main method
} // end of class NotAsSimpleWhile
