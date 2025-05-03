package JavaEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class Ex23Lambda {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(9);
        numList.add(1);
        Collections.sort(numList);

        Consumer<Integer> numMethod = item -> System.out.println(item);
        numList.forEach(numMethod);

        // numList.forEach(item -> System.out.println(item));
    }
    
}
