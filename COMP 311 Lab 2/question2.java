/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 2
*/

// Importing a Scanner
import java.util.Scanner;

public class question2 {
    public static void main (String[] args){

        Scanner console = new Scanner (System.in);

        // Ask the user to enter their fullName
        System.out.print("Enter your full name: ");
        //Reading the user's full name
        String fullName = console.nextLine().toUpperCase();

        //Asking the user to enter a letter
        System.out.print("Enter a letter: ");
        // Reading the user's letter
        String character = console.next().toUpperCase();
        console.close();

        // Displaying the total number of characters in the user's full name
        System.out.println("Total number of characters in your full name: " + fullName.length());

        // Displaying the user's fullname in uppercase
        System.out.println("User's full name in uppercase: " + fullName.toUpperCase());

        // Displaying the user's full name in lowercase
        System.out.println("User's full name in Lowercase: " + fullName.toLowerCase());

        // Displaying if the user's letter is contained in the user's full name
        System.out.println("Does " + fullName + " contain the letter " + character + ": " + fullName.contains(character));

    }
    
}
