/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 6
*/
// Importing a Scanner
import java.util.Scanner;

public class question6 {
    public static void main (String[] args){
        // Creating a scanner
        Scanner console = new Scanner (System.in);

        // Asking the user to enter a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");
        // Reading the user's number
        int number = console.nextInt();
        console.close();

        // Determining the day of the week based on the user's number
        switch(number){
            case 1:
                System.out.println("The day of the week is Monday");
                break;
            case 2:
                System.out.println("The day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The day of the week is Thursday");
                break;
            case 5:
                System.out.println("The day of the week is Friday");
                break;
            case 6:
                System.out.println("The day of the week is Saturday");
                break;
            case 7:
                System.out.println("The day of the week is Sunday");
                break;
            default:
                System.out.println("!!!Invalid number!!!");
        }
    }
    
}
