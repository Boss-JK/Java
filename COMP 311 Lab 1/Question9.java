/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 9
*/

import java.util.Scanner;

public class Question9 {
    public static void main (String[] args){

    Scanner scan = new Scanner (System.in);

    //Ask the user to enter a sentence
    System.out.print("Enter a sentence: ");
    // Reading the user's sentence
    String sentence = scan.nextLine();
    scan.close();

    //Displaying the length of the user's sentence
    System.out.println("Length: " + sentence.length());

    //Displaying the user's sentence in upper case
    System.out.println("Upper case: " + sentence.toUpperCase());

    //Displaying the user's sentence in lower case
    System.out.println("Lower case: " + sentence.toLowerCase());

    //Checking if the user's sentence contains the word Java
    System.out.println("Contains 'Java': " + sentence.contains("Java"));
    }
}
