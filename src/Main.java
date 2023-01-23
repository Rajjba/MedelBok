import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        while(true){
            System.out.println("Do you want to create a new author and book?");

            Scanner myScan = new Scanner(System.in);
            String answer = myScan.next();
            if(Objects.equals(answer, "yes")){
                new Author();
            }
            if(Objects.equals(answer, "no")){
                break;
            }
        }
    }
}