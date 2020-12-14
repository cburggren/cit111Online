package week5;

/**
 *
 * @author Courtney
 * switch displays a month name based on int of a number of month
 */
public class SwitchDemo {
    public static void main(String[] args) {
     int month = 2;
     String name;
     name = switch (month) {
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sept";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "Invalid month";
        }; //end of switch
        System.out.println(name);
    } // end of main method
} // end of clas SwitchDemo
