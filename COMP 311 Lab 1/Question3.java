/*
*Student Name: Bosa Jeremiah Kerobale
*Student ID: 24019732
*Question 3
*/
// Importing the scanner
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Ask user to enter their first name
        System.out.print("Enter your name: ");
        //Read the user's first name
        String userName = scan.nextLine();

        //Ask the user to enter their age
        System.out.print("Enter your age: ");
        //Read the user's age
        int userAge = scan.nextInt();
        scan.close();

        //Display user's name and age in a sentence
        System.out.println("Hey " + userName + ", are you " + userAge + " this year?");
    }  
}
