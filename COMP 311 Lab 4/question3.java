/*
* Student Name: Bosa Jeremaih Kerobale 
* Student ID: 24019732
* Question 3
*/
// Importing packages
import java.io.*;
public class question3 {
    public static void main (String[] args) {
        try {
            // Creating a printwriter
            PrintWriter writer = new PrintWriter (new File ("numbers.txt"));

            // Initialization and declaration of an integer array
            int[] arr = {4, 8, 21, 47, 22, 64};

            // Initialization of sum, largest and smallest
            int sum = 0;
            int largest = arr[0];
            int smallest = arr[0];

            for (int i = 0; i < 6; i++){
                sum += arr[i];
            }

            for (int j = 0; j < 6; j++){
                if (arr[j] > largest) {
                    largest = arr[j];
                } else if (arr[j] < smallest){
                    smallest = arr[j];
                }
            }
            // Displaying the sum, largest and smallest
            writer.println ("The sum is " + sum);
            writer.println ("The largest number is " + largest);
            writer.println("The smallest number is " + smallest);
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
