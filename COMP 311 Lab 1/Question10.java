/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 10
*/

import java.util.Scanner;

public class Question10 {

    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);

        //Ask the user to enter their full name
        System.out.print("Enter your full name: ");
        // Reading the user's full name
        String fullName = scan.nextLine();
        scan.close();

        // Displaying the user's first name
        System.out.println("First Name: " + fullName.substring( 0, fullName.indexOf(" ")));
        // Displaying the user's surname
        System.out.println("Surname: " + fullName.substring(fullName.indexOf(" ")));
        // Displaying the user's initials
        System.out.println("Initials: " + fullName.toUpperCase().charAt(0) + "." + fullName.toUpperCase().charAt(fullName.indexOf(" ") + 1) + ".");
    }
}
