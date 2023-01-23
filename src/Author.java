import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Author{

    static String name;
    static String email;
    static char gender;
    static Book book;

    public Author() throws IOException {
        book = new Book(this);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Book author: ");
        name = reader.readLine();

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Author Email: ");
        email = reader1.readLine();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Authors Gender, M or F: ");
        gender = reader2.next().charAt(0);

        while(true){
            System.out.println("summarize book info?");
            Scanner myScan = new Scanner(System.in);
            String answer = myScan.next();
            if(Objects.equals(answer, "yes")){
                book.getBook();
            }
            else if(Objects.equals(answer, "no")){
                System.out.println("okay.");
            }

            System.out.println("Do you want to change the book's title?");
            Scanner myScan1 = new Scanner(System.in);
            String answer1 = myScan1.next();
            if(Objects.equals(answer1, "yes")){
                System.out.println("This is the book's title: " + book.getName());
                System.out.println("Enter new title: ");
                BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
                String newName = reader3.readLine();
                book.setName(newName);
            }
            else if(Objects.equals(answer1, "no")){
                System.out.println("okay.");
            }

            System.out.println("Do you want to change price of book?");
            Scanner myScan2 = new Scanner(System.in);
            String answer2 = myScan2.next();
            if(Objects.equals(answer2, "yes")){
                System.out.println("This is the book's price: " + book.getPrice());
                System.out.println("Enter new price(0.0): ");
                Scanner myScan3 = new Scanner(System.in);
                double newPrice = myScan3.nextDouble();
                book.setPrice(newPrice);
            }
            else if(Objects.equals(answer2, "no")){
                System.out.println("okay.");
            }

            System.out.println("Do you want to change how many copies there are of the book?");
            Scanner myScan3 = new Scanner(System.in);
            String answer3 = myScan3.next();
            if(Objects.equals(answer3, "yes")){
                System.out.println("This is the quantity of copies: " + book.getQty());
                System.out.println("Enter new quantity: ");
                Scanner myScan4 = new Scanner(System.in);
                int newQty = myScan4.nextInt();
                book.setQty(newQty);
            }
            else if(Objects.equals(answer3, "no")){
                System.out.println("okay.");
            }
            System.out.println("Are you satisfied?");
            Scanner myScan4 = new Scanner(System.in);
            String answer4 = myScan4.next();
            if(Objects.equals(answer4, "yes")){
                break;
            }
            else if(Objects.equals(answer4, "no")){
                System.out.println("okay, here are the questions again: " + "\n");
            }
        }
    }
}
