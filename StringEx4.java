package JavaEntry;

public class StringEx4 {
    public static void main(String[] arg){
        String stringText = "Java Practice Example 4";
        String stringText2 = " With String details";

        System.out.println(stringText + ", the length of the text is " + stringText.length());
        System.out.println(stringText.toUpperCase());
        System.out.println(stringText.toLowerCase());
        System.out.println("Practice word position is " + stringText.indexOf("Practice"));
        System.out.println(stringText.concat(stringText2));

        String x = "10";
        String y = "5";
        System.out.println("Concatenation - " + (x + y));  // Integer will add, string will concate

        String speText = "If you have a some \"special's\" text in between text";
        System.out.println(speText);


    }
}
