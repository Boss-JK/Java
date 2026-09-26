/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 1
*/
import java.util.*;
import java.io.*;

public class question1 {
    public static void main (String[] args) throws Exception {
        // Create a printwriter
        PrintWriter writer = new PrintWriter ("story.txt");

        // Write at least 5 lines
        writer.println("Party down town.");
        writer.println("Game On!!");
        writer.println("I haven't reached my prime yet, Just Watch!!");
        writer.println("History shall be rewriiten.");
        writer.println("The name's Kerobale, Bosa Kerobale.");
        writer.close();

        // Create a scanner 
        Scanner console = new Scanner (new FileReader ("story.txt"));

        while (console.hasNext()){
            // Reading story.txt line by line
            System.out.println(console.nextLine());
        }
        console.close();
    }
}