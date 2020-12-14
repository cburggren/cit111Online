package week13;

/**
 *
 * @author courtney
 */
public class IntegerArray {
    public static void main(String[] args) {
        //create array of writing instruments
        int[] writingInstruments = new int[5];
        
        writingInstruments[0] = 20;
        writingInstruments[1] = 22;
        writingInstruments[2] = 5;
        writingInstruments[3] = 23;
        writingInstruments[4] = 12;
        
        printNumericArrayManually(writingInstruments);
        
        
        //display average and sum by calling calc average method 
        System.out.println("The average value in the array is " + calculateAverage(writingInstruments));
        
        //calling method to get sum and average of flasks array from the flask method
        createAndAnalyzeFlasksArray();
        
    } // end of main method
    
    //methd to print the contents of an array
    public static void printNumericArrayManually(int[] array){
        //get array size
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++){
            System.out.println("Number of pens in cup " + i + ": " + array[i]);
        } // end of for loop
    } // end of method printNumericArrayManually
    
    //method that computes the sum of all elelments in int array
    public static int computeSumOfArray(int[] array){
        //get length of array
        int arraySize = array.length;
        //declare sum 
        int sum = 0;
        //use length in for loop to add each element to total 
        for (int i = 0; i < arraySize; i++){
            sum += array[i];
        } // end of for loop
        System.out.println("The sum of the elements in the array is: " + sum);
        return sum;
    } // end of method computeSumOfArrays
    
    //method that calculates average pen count by taking in array, calling the
    //sum method and dividing by the length of the array
    public static double calculateAverage(int[] array){
        //call sum method into var for sum
        double sum = computeSumOfArray(array);
        double average = sum / array.length;
        return average;
    } // end of method calculateAverage
    
    //method 
    public static void createAndAnalyzeFlasksArray(){
        int[] flasks = new int[4];
        
        flasks[0] = 250;
        flasks[1] = 100;
        flasks[2] = 185;
        flasks[3] = 150;
        
        printNumericArrayManually(flasks);
        System.out.println("The average value of flasks is " + calculateAverage(flasks));
    } // end of method createAndAnalyzeFlasksArray
} // end of class IntegerArray
