package JavaEntry.Excersize;
import java.util.Scanner;

public class NumberEx {
    public static void main(String[] args){
        try(Scanner userInput = new Scanner(System.in)){
            System.out.println("Please enter any number");
            int numb = userInput.nextInt();

            // Find the number Positive or Negetive, Even or Odd
            if(numb % 2 == 0){
                System.out.println(numb + " is Even");
            }else {
                System.out.println(numb + " is Odd");
            }
            if(numb > 0){
                System.out.println(numb + " is Positive");
            } else{
                System.out.println(numb + " is Negetive");
            }
        }
    }
}
