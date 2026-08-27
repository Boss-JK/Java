/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 4
*/
// Importing a scanner
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        //Ask the user to enter a whole number
        System.out.print("Enter a whole number: ");
        //Reading the user's input
        int number = scan.nextInt();

        //Ask the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        // Reading the user's decimal number
        double decimalNumber = scan.nextDouble();

        // Ask the user to enter a word
        System.out.print("Enter a word: ");
        // Reading the user's word
        String word = scan.next();

          // Ask the user to enter a another word
        System.out.print("Enter a another word: ");
        // Reading the user's second word
        String secondWord = scan.next();
        scan.close();

        //Display the user's inputs in a sentence
        System.out.println("You entered the integer " + number + ", the decimal " + decimalNumber + ", " + secondWord + " " + word + ".");

    }
    
}
