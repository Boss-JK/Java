/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 4
*/
import java.util.*;
import java.io.*;
public class question4 {
    public static void main (String[] args) {
        try {
            // Creating a scanner
            Scanner console = new Scanner (new FileReader ("story.txt"));

            // Intializing and declaring lineCount
            int lineCount = 0;

            while (console.hasNext()){
                // Counting the number of lines in story.txt
                lineCount ++;
            }
            System.out.println("The number of lines in story.txt is " + lineCount);
            System.out.println("Successful");
            console.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
