/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 8
*/
import java.util.*;
import java.io.*;
public class question8 {
    public static void main (String[] args){
        try {
            // Creating a printwriter
            PrintWriter writer = new PrintWriter ("numbers.txt");

            // Intializing and declaring sum
            int sum = 0;

            // Writing numbers in numbers.txt
            writer.println("55");
            writer.println("78");
            writer.println("32");
            writer.println("21");
            writer.println("15");
            writer.println("98");
            writer.println("43");
            writer.println("9");
            writer.println("81");
            writer.println("2");
            writer.close();

            // Creating a sacnner
            Scanner console = new Scanner (new FileReader ("numbers.txt"));

            while (console.hasNextInt()){
                // Totaling the sum
                sum += console.nextInt();
            }
            System.out.println("Sum is " + sum);
            console.close();
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
}
