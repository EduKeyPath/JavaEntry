package JavaEntry.Excersize;
import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args){

        // Sum of all Array elements.
        int[] numArry = {1,2,3,4,5};
        int sum = 0;
        for(int i=0; i<numArry.length; i++){
            sum+= numArry[i];
        }
        System.out.println("Sum of all Array elements - " + sum);


        // Convert String to Array
        String stringText = "Java Practice";
        char[] stringArry = stringText.toCharArray();
        for(char i:stringArry){
            System.out.print(i + ", ");
        }
        System.out.println(" ");


        // Array Sorting
        int[] numList = {5,2,1,8,4,9,10,20,11};
        Arrays.sort(numList);
        System.out.println(Arrays.toString(numList));

        String[] fruits = {"Banana", "Mango", "Apple", "Watermelon", "Grapes"};
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

    }
}
