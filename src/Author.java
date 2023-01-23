import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Author{

    static String name;
    String email;
    char gender;
    static Book book;

    public Author() throws IOException {
        book = new Book(this);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Book author: ");
        name = reader.readLine();

        GetBook();
    }
    void GetBook(){
        System.out.println(Author.name + "\n" + Author.book.name);
    }
}
