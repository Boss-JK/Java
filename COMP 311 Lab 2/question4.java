/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 4
*/

// Importing packages
import java.util.Scanner;
import java.io.*;

public class question4 {
    public static void main (String[] args) throws Exception{
        // Creating a file to write in
        File sourceFile = new File ("results.txt");

        // Creating a scanner
        Scanner console = new Scanner (System.in);

        // Creating a PrintWriter
        PrintWriter writer = new PrintWriter (sourceFile);

        // Writing to the results.txt file
        for (int i = 1; i <= 5; i++){
            // Ask the user to enter a student's full name and their score
            System.out.print("Enter a student's full name and their score: ");
            // Reading the user's inputs
            String userInputs = console.nextLine();
            // Writing the user's inputs to the results.txt file
            writer.println(userInputs);
        }
        console.close(); // Closing the scanner
        writer.close(); // Closing the PrintWriter

        // Displaying the contents of the results.txt file
        Scanner fileScanner = new Scanner(sourceFile);
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close(); // Closing the file scanner
    }
    
}
