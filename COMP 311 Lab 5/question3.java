/*
* Student Name: Bosa Jermiah Kerobale
* Student ID: 24019732
* Question 3
*/
public class question3{
    public String title;
    public String author;
    public double price;

    public question3() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    public question3 (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public static void main (String[] args) {

    question3 q1 = new question3("One Piece", "Oda", 129.99);
    question3 q2 = new question3("Jujutsu Kaisen", "Gege", 199.99);

    System.out.println(q1.title + q1.author + q1.price);
    System.out.println(q2.title + q2.author + q2.price);

}
