/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 4
*/
// Practicing Method overloading
public class question4 {
    // Combining two integers together
    public static int combine(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    // Combining two decimals together
    public static double combine(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    // Combining two strings together
    public static String combine(String firstLine, String secondLine){
        return firstLine + secondLine;
    }

    public static void main (String[] args){
        System.out.println("Addition two integers using method overloading: " + combine(5,7));
        System.out.println("Addition two decimals using method overloading: " + combine(4.8,4.8));
        System.out.println("Addition two strings using method overloading: " + combine("We're ", "Winning"));
    }
    
}
