package JavaEntry;
import java.util.Scanner;

class Ex13Api {
    public static void main(String[] arg){
        Scanner apiScanner = new Scanner(System.in);
        System.out.println("Your name please");

        String customerName = apiScanner.nextLine();
        System.out.println(customerName + "Thank you for you information");
    }    
}
