public class Book2 {
   // Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
   private String title;
   private String author;
   private double price;

   public Book2() {
      this.title = "";
      this.author = "";
      this.price = 0.0;
   } 
    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   public String getSummary() {
    return title + " created by " + author + " costs " + price;
   }

   public static void main (String[] args){
    Book2 b1 = new Book2("One Piece", "Oda", 129.99);
    b1.getSummary();
   }
}
