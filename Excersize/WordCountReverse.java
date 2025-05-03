package JavaEntry.Excersize;
import java.util.Scanner;

public class WordCountReverse {
    public static void main(String[] args){
        String userText = "";
        String whatToDo = "";

        try(Scanner userInput = new Scanner(System.in)){
            System.out.println("Please type your sentence.");
            userText = userInput.nextLine();

            System.out.println("You want to count the words or reverse? Type - Count or Reverse");
            whatToDo = userInput.nextLine();
        }
        if(whatToDo.equalsIgnoreCase("Count")){
            int totalWordCount = userText.split("\\s").length;
            System.out.println("Total word count is: " + totalWordCount);
        }else if(whatToDo.equalsIgnoreCase("Reverse")){
            String reverseString = "";
            for(int i = 0; i<userText.length(); i++){
                reverseString = userText.charAt(i) + reverseString;
            }
            System.out.println("Reverse Text is - " + reverseString);
        }
    }
}
