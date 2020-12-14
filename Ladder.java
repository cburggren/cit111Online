package week4;

/**
 *
 * @author Courtney
 * demonstrates i-else ladder
 */
public class Ladder {
    public static void main(String[] args) {
        int x;
        
        for (x=0; x<6; x++){
            if(x==1)
                System.out.println("x is one");
            else if (x==2)
                System.out.println("x is 2");
            else if (x==3)
                System.out.println("x is three");
            else if (x == 4)
                System.out.println("x is four");
            else
                System.out.println("x is not between 1 and four");
        } // end of for loop
    } // end of main method
} // end of class Ladder
