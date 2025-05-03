package JavaEntry.Excersize;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int userInput1 = 0, userInput2 = 0;
        String whatToDo = "";

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your first no.");
            userInput1 = input.nextInt();

            System.out.println("Enter your second no.");
            userInput2 = input.nextInt();
            input.nextLine();

            System.out.println("You want to Add(+), Substract(-), Multiply(*), Division(/), enter the symbol.");
            whatToDo = input.nextLine();

        }catch(Exception e){
            System.out.println("Something went wrong");
        }
        switch (whatToDo){
            case "+":
                System.out.println("Total is - " + (userInput1 + userInput2));
            break;
            case "-":
                System.out.println("Total is - " + (userInput1 - userInput2));
            break;
            case "*":
                System.out.println("Total is - " + (userInput1 * userInput2));
            break;
            case "/":
                System.out.println("Total is - " + (userInput1 / userInput2));
            break;
            default:
                System.out.println("Invalid entry");
            break;

        }
    }
}
