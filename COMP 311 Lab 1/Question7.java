/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 7
*/
import java.util.Scanner;
public class Question7 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        // Ask user to enter the temperature
        System.out.print("Enter the temperature in Degrees Celsius: ");
        // Reading the user's temperature
        double degreesCelsius = scan.nextDouble();
        scan.close();

        //Converting the temperature in degrees Celsius to Fahrenheit
        double degreesFahrenheit = (degreesCelsius * (9.0/5.0)) + 32;

        //Displaying the temperature in degrees celsius and fahrenheit
        System.out.println(degreesCelsius + " degrees celsius in degrees fahrenheit is " + degreesFahrenheit); // This sounds better
    }
}
