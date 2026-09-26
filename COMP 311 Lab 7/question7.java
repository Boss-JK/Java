/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 7
*/
import java.io.*;
public class question7 {
    public static void main (String[] args){
        try {
            FileWriter writer = new FileWriter ("output.txt", true);

            // Writing an additional two lines in output.txt
            writer.write("Java is fun!!");
            writer.write(" ");
            writer.write("I did it!!");

            System.out.println("Successful");

            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
