package JavaEntry;

public class Ex19Exception {

    static void checkPass(int age){
        if(age > 18){
            System.out.println("You can enter");
        }else{
            throw new ArithmeticException("You are not allow to enter");
        }
    }

    public static void main(String[] args){
        try{
            int[] numberList = {1, 2, 3, 4};
            System.out.println(numberList[0]); // This will print
            checkPass(10);
            System.out.println(numberList[10]); // This will not print and stop the whole program, to avoid use exception

        }catch(Exception e){
            System.out.println("Something went wrong, " + e);
        }finally{
            System.out.println("The 'try catch' is finished");
        }
    }
}
