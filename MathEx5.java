package JavaEntry;

public class MathEx5 {
    public static void main(String[] arg){
        byte x = 10;
        byte y = 5;
        int MaxValue = Math.max(x, y);
        int MinValue = Math.min(x, y);
        int RandomValue = (int) (Math.random() * 11);
        int PositiveValue = Math.abs(-79);

        System.out.println("Max value is: " + MaxValue + " and Min value is: " + MinValue);
        System.out.println("Make this positive: " + PositiveValue);
        System.out.println("Random value between two 1 to 10: " + RandomValue);

    }
}
