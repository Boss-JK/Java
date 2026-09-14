/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 2
*/
// Importing packages
import java.io.*;
public class question2 {
    public static void main (String[] args) {
        try {
            // Create a print writer
            PrintWriter writer = new PrintWriter (new File ("decimals.txt"));

            // Intializing and declaring an array with double values
            double[] arr = {4.8, 7.8, 5.2, 6.7, 1.2, 0.7};

            for (int i = 0; i < 6; i++) {
              writer.println(arr[i]);
            }
            System.out.println("Successful");
            writer.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
