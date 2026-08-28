/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 8
*/

import java.util.Scanner;

public class Question8 {
public static void main (String[] args){
    
    Scanner scan = new Scanner (System.in);

    //Ask the user to enter the length
    System.out.print("Enter the length: ");
    //Reading the user's length value
    double length = scan.nextDouble();

    //Ask the user to enter the width
    System.out.print("Enter the width: ");
    //Reading the user's width value
    double width = scan.nextDouble();
    scan.close();

    //Calculating the area of the rectangle
    double areaOfRectangle = length * width;
    //Displaying the area of the rectangle
    System.out.println("Area: " + areaOfRectangle);

    //Calculating the perimeter of the rectangle
    double perimeterOfRectangle = 2.0 * (length + width);
    //Displaying the perimeter of the rectangle
    System.out.println("Perimeter: " + perimeterOfRectangle);

}
}
