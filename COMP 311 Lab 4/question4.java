/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 4
*/
// Importing a scanner
import java.util.Scanner;
public class question4 {
    public static void main (String[] args) {
        // Creating a scanner
        Scanner console = new Scanner (System.in);

        // Ask the user to enter a whole number
        System.out.print("Enter a whole number: ");
        // Reading the user's number
        int number = console.nextInt();
        console.close();
        // Converting the user's number into binary
        String binary = Integer.toBinaryString(number);

        // Displaying the user's number and it's binary representation
        System.out.println(number + " in binary is " + binary);
    }
}
