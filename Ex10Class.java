package JavaEntry;

public class Ex10Class { // Class is a bluprint
    final int x = 10;  // With final keyword we cant modify the x value.
    int y = 20;
    public int multiply(int a, int b){
        return a * b;
    }
    static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        Ex10Class classObj = new Ex10Class();  // we can create a multiple object using the same class.
        Ex10Class classObj2 = new Ex10Class(); // we can create a multiple object using the same class.
        int sum = classObj.multiply(classObj.x, classObj2.y); // Call class public method using object.
        int add = add(classObj.x, classObj2.y); // Call class static method direct class.

        System.out.println(classObj.x);
        System.out.println(classObj2.y);
        System.out.println("Total Multiply: " + sum);
        System.out.println("Total Add: " + add);

        classObj2.y = 30; // we can modify the object.
        System.out.println(classObj2.y);


        // Import class from another class
        Ex10ClassImport importClass = new Ex10ClassImport();
        importClass.printMyName("Banti Shaw");
        
    }
}
