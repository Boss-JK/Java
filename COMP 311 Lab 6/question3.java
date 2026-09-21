/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 3
*/
// Seeing the difference betweeen void and returning methods
public class question3 {
    // A Void Method 
    public static void printBanner(){
        System.out.println("Game On!!");
    }
    // A Returning Method
    public static String getBanner(String line){
        return line;
    }

    public static void main (String[] args){
        printBanner();
        System.out.println(getBanner("Game On!!"));
    }
}
