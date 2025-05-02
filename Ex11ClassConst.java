package JavaEntry;

public class Ex11ClassConst { // Createing a class
    int x;
    String text;
    String total;

    public Ex11ClassConst(int y, String content){  // Createing a class constructor
        x = 10;  // Assign value in class attribute
        total = content + x + y;
    }

    public static void main(String[] args){
        Ex11ClassConst constObj = new Ex11ClassConst(5, "The total value is ");   // we can pass value to the constructor
        System.out.println(constObj.x);
        System.out.println(constObj.total);
    }

}
