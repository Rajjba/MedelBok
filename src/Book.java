import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Book {

    String name;
    Author writer;
    double price;
    int qty = 0;

    public Book(Author writer) throws IOException {
        this.writer = writer;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Book name: ");
        this.name = reader.readLine();
    }
}
