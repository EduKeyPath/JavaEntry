package JavaEntry;

public class MethodEx9 {
    static void firstMethod(){
        System.out.println("This is my first Java Method");
    }
    
    // One functiion, multiple output
    static void printMyName(String name, int roll){
        System.out.println("Name: " + name + ", Roll no: " + roll);
    }

    static void checkAgeGroup(int age){
        if(age >= 18){
            System.out.println("Adult, your age is: " + age);
        }else {
            System.out.println("Not Adult, you age is: " + age);
        }
    }

    static int multiplyTwoNum(int x, int y){
        return x * y;
    }

    //Method override (If required)
    static double multiplyTwoNum(double x, double y){
        return x * y;
    }

    // Recursive function: making a function call itself till its reach the result.
    static int recurFunc(int num){
        if(num > 0){
            return num + recurFunc(num - 1); // Result will be (5+4+3+2+1 = 15);
        }else {
            return 0;
        }
    }

    public static void main(String[] args){
        firstMethod();
        printMyName("Banti", 001);
        printMyName("Anand", 002);
        printMyName("Amol", 003);
        checkAgeGroup(29);
        int sum = multiplyTwoNum(5, 10);
        System.out.println("5 X 10 = " + sum);
        System.out.println("5 X 10 = " + multiplyTwoNum(5.55, 10.15));

        int reCursRes = recurFunc(5);
        System.out.println("ReCurssive Function: " + reCursRes);
    }
}
