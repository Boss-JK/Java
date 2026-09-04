/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 7
*/
// Importing packages
import java.util.Scanner;
import java.io.*;
public class question7 {
    public static void main (String[] args) throws Exception{
        // The file you are reading from
        File firstFile = new File ("numbers.txt");

        // Creating a file 
        File secondFile = new File ("stats.txt");

        // Creating a file reader
        FileReader reader = new FileReader (firstFile);

        // Creating a scanner
        Scanner console = new Scanner (reader);

        // Creating a print writer
        PrintWriter writer = new PrintWriter (secondFile);
        
        // Initializing smallest
        int smallest = Integer.MAX_VALUE;
        // Initializing largest
        int largest = Integer.MIN_VALUE;
        // Initializing the count
        int count = 0;
        
        // Checking for the smallest and largest numbers
        while (console.hasNextInt()){
            int number = console.nextInt();

            if (number < smallest){
                smallest = number;
            } else if (number > largest){
                largest = number;
            }
        }
        // Writing the smallest and largest numbers in stats.txt
        writer.println("The smallest number is: " + smallest);
        writer.println("The largest number is: " + largest);

        // Calculating the sum
        while (console.hasNextInt()){
            int sum = 0;
            int number = console.nextInt();
            sum += number;
            count++;
        
        //Calculating the average
        double average = sum / count;
        writer.println("The average is: " + average);
        }
        // Closing the scanner
        console.close();
        // Closing the writer
        writer.close();
    }
    
}
