package JavaEntry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex20RegExp {
    public static void main(String[] args){
        Pattern custPattern = Pattern.compile("SMU", Pattern.CASE_INSENSITIVE);
        Matcher findWord = custPattern.matcher("My name is Banti Shaw and I am doing MCA from SMU.");
        boolean checkText = findWord.find();
        if(checkText){
            System.out.println("Sentence contain the provided text");
        }else {
            System.out.println("Provided text not exist in the sentence");
        }
    }
}
