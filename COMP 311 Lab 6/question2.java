/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 2
*/
public class question2 {
    // Method for calculating the area of a circle
    public static double circleArea (double radius){
        System.out.print("The radius of the circle is " + radius + " therfore ");
        return 3.142 * (radius * radius);
    }

    public static void main (String[] args){
        System.out.println("the area of the circle is " + circleArea(5.1));
        System.out.println("the area of the circle is " + circleArea(2.2));
        System.out.println("the area of the circle is " + circleArea(20.8));
    }
}
