/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 1
*/

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    public Book (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


public static void main (String[] args) {

    Book b1 = new Book("One Piece", "Oda", 129.99);
    Book b2 = new Book("Jujutsu Kaisen", "Gege", 199.99);

    System.out.println(b1.title + b1.author + b1.price);
    System.out.println(b2.title + b2.author + b2.price);

}

}