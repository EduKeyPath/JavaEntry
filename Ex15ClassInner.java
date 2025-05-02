package JavaEntry;

class ParentClass {
    int x = 10;
    String name = "Banti";

    class InnerClass {
        int y = 20;
        public String getName(){
            return name;
        }
    }
}


public class Ex15ClassInner {
    public static void main(String[] args){
        ParentClass parenClassObj = new ParentClass();
        ParentClass.InnerClass innerClassObj = parenClassObj.new InnerClass();

        System.out.println(parenClassObj.x);
        System.out.println(innerClassObj.y);
        System.out.println(innerClassObj.getName());

    }
}