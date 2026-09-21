/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 5
*/
public class question5 {
    public static void displayInfo(String name){
        System.out.println("This method only displays your name");
        System.out.println("Your name is " + name);
    }

    public static void displayInfo(String name, int age){
        System.out.println("This method displays your name and age");
        System.out.println("A " + age + " year old named " + name);
    }

    public static void main (String[] args){
        displayInfo("Bossman");
        System.out.println(" ");
        displayInfo("Bossman", 19);
    }
}
