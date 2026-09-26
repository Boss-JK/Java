/*
* Student Namw: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 5
*/
import java.io.*;
import java.util.*;

public class question5 {
    public static void main (String[] args) {
        try {
            // Creating a scanner
            Scanner console = new Scanner (new FileReader ("story.txt"));

            // Intializing and declaring lineCount
            int wordCount = 0;

            while (console.hasNext()){
                // Counting the number of lines in story.txt
                console.nextLine();
                wordCount ++;
            }
            System.out.println("The number of words in story.txt is " + wordCount);
            System.out.println("Successful");
            console.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
