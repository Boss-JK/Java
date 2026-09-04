/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 5
*/

// importing packages
import java.util.*;
import java.io.*;

public class question5 {
    public static void main (String[] args) throws Exception{
        // The file you are reading from
        File firstFile = new File ("students.txt");

        // Creating a file
        File secondFile = new File ("grades.txt");

        // Creating a file reader
        FileReader reader = new FileReader (firstFile);

        // Creating a scanner
        Scanner console = new Scanner (reader);

        // Creating a print writer
        PrintWriter writer = new PrintWriter (secondFile);

        while (console.hasNextLine()){
            // Reading the student's full name
            String student = console.nextLine();

            String[] parts = student.split(",");

            String studentFullName = parts[0].trim();
            // Reading the student's score
            int studentScore = Integer.parseInt(parts[1].trim());
            // Assigning a grade to the student's score and writing it in the grades.txt file
            if (studentScore >= 0 && studentScore <= 100){
                if (studentScore < 50.0){
                    writer.println(studentFullName + ", " + studentScore + ": Grade: F");
                } else if (studentScore >= 50.0 && studentScore <= 59.0){
                    writer.println(studentFullName + ", " + studentScore + ": Grade: D");
                } else if (studentScore >= 60.0 && studentScore <= 69.0){
                    writer.println(studentFullName + ", " + studentScore + ": Grade: C");
                } else if (studentScore >= 70.0 && studentScore <= 79.0){
                    writer.println(studentFullName + ", " + studentScore + ": Grade: B");
                } else if (studentScore >= 80.0){
                    writer.println(studentFullName + ", " + studentScore + ": Grade: A");
            }
         } else {
            writer.println("!!!Invalid Mark!!!");
        }
        }
        console.close(); // Closing the scanner
        writer.close(); // Closing the writer
    }
    
}
