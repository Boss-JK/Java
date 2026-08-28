/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 6
*/
import java.util.Scanner;
public class Question6 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        // Ask user to enter four scores
        System.out.print("Enter four test scores by spacing them: ");
        //Reading the user's four test scores
        int firstScore = scan.nextInt();
        int secondScore = scan.nextInt();
        int thirdScore = scan.nextInt(); 
        int fourthScore = scan.nextInt();
        scan.close();

        //Calculating the average of the user's three three test scores
        double average = (firstScore + secondScore + thirdScore + fourthScore) / 4.0;
        // Displaying the average
        System.out.println("Average: " + average);
    }
    
}
