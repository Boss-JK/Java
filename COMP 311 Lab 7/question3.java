/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 3
*/
import java.util.*;
import java.io.*;
public class question3 {
    public static void main (String[] args){
        try {
            // Create a scanner
            Scanner console = new Scanner (new FileReader ("missing.txt"));

            while (console.hasNext()){
                // Read missing.txt line by line
                System.out.println(console.next());
            }
            console.close();
        } catch (Exception e) {
            System.out.println("File does not exist!!!!");
            System.out.println("Please create the file you want to read");
        }
    }
}
