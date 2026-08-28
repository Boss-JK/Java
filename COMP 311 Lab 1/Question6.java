/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 6
*/
import java.util.Scanner;
public class Question6 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        // Ask user to enter three scores
        System.out.print("Enter three test scores by spacing them: ");
        //Reading the user's three test scores
        int firstScore = scan.nextInt();
        int secondScore = scan.nextInt();
        int thirdScore = scan.nextInt();        
        scan.close();

        //Calculating the average of the user's three three test scores
        double average = (firstScore + secondScore + thirdScore) / 3.0;
        // Displaying the average
        System.out.println("Average: " + average);
    }
    
}
