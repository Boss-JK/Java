/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 5
*/
import java.util.Scanner;
public class Question5 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        // Ask user to enter a number
        System.out.print("Enter the First Number: ");
        // Reading the user's first number
        double firstNumber = scan.nextDouble();

        //Ask usesr to enter a another number
        System.out.print("Enter a Second Number: ");
        // Reading the user's second number
        double secondNumber = scan.nextDouble();

        // Ask user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        // Reading the user's decimal number
        double decimalNumber = scan.nextDouble();
        scan.close();

        // Calculating the sum and displaying it
        double sum = firstNumber + secondNumber + decimalNumber;
        System.out.println("Sum: " + sum);

        // Calculating the difference and displaying it
        double difference = firstNumber - secondNumber;
        System.out.println("Difference: " + difference);

        // Calculating the product and displaying it
        double product = secondNumber * decimalNumber;
        System.out.println("Product: " + product);

        // Calculating the quotient and displaying it
        double quotient = firstNumber / secondNumber;
        System.out.println("Quotient: " + quotient);

        // Calculating the remainder and displaying it
        double remainder = firstNumber % secondNumber;
        System.out.println("Remainder: " + remainder);

    }
    
}
