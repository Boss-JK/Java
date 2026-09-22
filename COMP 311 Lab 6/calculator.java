/*
* Student Name: Bosa Jeremiah Kerobale
* Student ID: 24019732
* Question 6
*/
public class calculator {
    public static int add(int a, int b){
        return a + b;
    }

    
    public void multiply(int a, int b){
        int product = a * b;
        System.out.println("Product is " + product);
    }

    public static void main(String[] args){
        calculator c1 = new calculator(); 
        c1.multiply(5, 4);

        System.out.println("Sum is " + add(5, 6));
    }
}
