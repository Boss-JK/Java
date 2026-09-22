/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 7
*/
public class question7 {
    public static void tryToDouble(int number){
        int newNumber = number * 2;
        System.out.println("Value after pass by value: " + newNumber);
    }

    public static void main (String[] args){
        int value = 15;
        System.out.println("Value before pass by value: " + value);

        tryToDouble(value);

        System.out.println("Value is " + value);
    }
}
