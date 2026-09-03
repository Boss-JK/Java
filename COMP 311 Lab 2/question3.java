/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 3
*/
// Importing packages
import java.util.Scanner;
import java.io.*;

public class question3 {
    public static void main (String[] args) throws Exception{
        // The file to read from
        File sourceFile = new File ("students.txt");

        // Intializing the file Reader
        FileReader reader = new FileReader (sourceFile);

        // Initializing the Scanner
        Scanner console = new Scanner (reader);

        // Displaying what was read from the file
        while (console.hasNext()){
        System.out.println(console.nextLine());
        }
    }
    
}
