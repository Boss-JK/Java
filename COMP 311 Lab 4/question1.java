/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 1
*/
// Importing packages
import java.util.*;
import java.io.*;
public class question1 {
    public static void main (String[] args) {
        try{
            // Creating a scanner
            Scanner console = new Scanner ( new FileReader ("names.txt"));

            // Creating the array
            String[] arr = new String[20];

            int i = 0;
            while (console.hasNext()){
                arr[i] = console.next();
                i++;
            }
            System.out.println("Successful");
            console.close();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
