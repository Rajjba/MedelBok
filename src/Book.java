import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Book {

    String name;
    Author writer;
    double price;
    int qty;

    public Book(Author writer) throws IOException {
        this.writer = writer;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Book name: ");
        this.name = reader.readLine();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter price(0.0): ");
        this.price = reader2.nextDouble();

        Scanner reader3 = new Scanner(System.in);
        System.out.println("Enter number of copies: ");
        this.qty = reader3.nextInt();
    }
    public void getBook(){
        System.out.println("Title: " + Author.book.name + "\n" + "Price: "+ Author.book.price +
                "\n" + "Quantity: " + Author.book.qty + "\n" + "Author: " + Author.name +
                "\n" + "Email: " + Author.email + "\n" + "Gender: " + Author.gender);
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public Author getAuthor(){
        return writer;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int newQty){
        this.qty = newQty;
    }
}
