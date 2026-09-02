/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 1
*/

// importing a scanner
import java.util.Scanner;

public class question1 {
    public static void main (String[] args){

        Scanner console = new Scanner (System.in);

        // Ask the user to enter a mark
        System.out.print("Enter a mark: ");
        // Reading the user's mark
        double mark = console.nextDouble();
        console.close();

        // Assigning a grade to the the user's mark
        if (mark >= 0 && mark <= 100){
            if (mark < 50.0){
                System.out.println("Grade: F");
            } else if (mark >= 50.0 && mark <= 59.0){
                System.out.println("Grade: D");
            } else if (mark >= 60.0 && mark <= 69.0){
                System.out.println("Grade: C");
            } else if (mark >= 70.0 && mark <= 79.0){
                System.out.println("Grade: B");
            } else if(mark >= 80.0){
                System.out.println("Grade: A");
            }
        } else {
            System.out.println("Invalid Mark!!!!!");
        }
    }
}
