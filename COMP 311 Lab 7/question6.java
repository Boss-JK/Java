/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 6
*/
import java.util.*;
import java.io.*;
public class question6 {
    public static void main (String[] args){
        try {
            // Creating scanner
            Scanner console = new Scanner (new FileReader ("story.txt"));

            // Creating a printwriter
            PrintWriter writer = new PrintWriter ("story_copy.txt");

            while (console.hasNext()){
                writer.println(console.nextLine());
            }
            console.close();
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
