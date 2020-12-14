package week13;

/**
 *
 * @author Courtney
 * looking at how to create a simple array
 */
public class ProgrammingBooks {
    public static void main(String[] args) {
        //create array objt that stores only Strings
        // and store a reference to that array in the variable books
        String[] books = new String[5];
        
        books[0] = "Perl Cookbook";
        books[1] = "PHP Cookbook";
        books[2] = "Python in a nutshell";
        books[3] = "Javascript: the Definitive Guide";
        books[4] = "Java in a Nutshell";
        
        System.out.println("Book at array index 0: ");
        System.out.println(books[0]);
        System.out.println("Book at array index 1: ");
        System.out.println(books[1]);
        System.out.println("Book at array index 2: ");
        System.out.println(books[2]);
        System.out.println("Book at array index 3: ");
        System.out.println(books[3]);
        System.out.println("Book at array index 4: ");
        System.out.println(books[4]);
    } // end of main method
} // end of class ProgrammingBooks
