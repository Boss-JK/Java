/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 1
*/

public class question1 {
    public static void isEven (int n){
        //Creating a method that checks if a iteger is even of not
        System.out.println("Checking if an integer is even or not??");
        if (n % 2 == 0){
            System.out.println(n + " True");
        } else {
            System.out.println(n + " False");
        }
    }

    public static void main (String[] args){
        isEven(2);
        isEven(21);
        isEven(98);
        isEven(33);
    }
}