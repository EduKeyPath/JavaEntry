package JavaEntry;

public class ClassConstEx11 { // Createing a class
    int x;
    String text;
    String total;

    public ClassConstEx11(int y, String content){  // Createing a class constructor
        x = 10;  // Assign value in class attribute
        total = content + x + y;
    }

    public static void main(String[] args){
        ClassConstEx11 constObj = new ClassConstEx11(5, "The total value is ");   // we can pass value to the constructor
        System.out.println(constObj.x);
        System.out.println(constObj.total);
    }

}
