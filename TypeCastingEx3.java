package JavaEntry;

public class TypeCastingEx3 {
    public static void main(String[] arg){
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // Narrowing Casting (manually) - converting a larger type to a smaller size type

        byte exNumber = 9;
        double changeByteTypeToDouble = exNumber;
        System.out.println(exNumber + " to " + changeByteTypeToDouble);  // Automatic casting: byte to double

        short passMarks = 800;
        short getMarks = 450;
        float markPercent = (float) getMarks / passMarks * 100.0f;   // Manual casting: short to float
        System.out.println(markPercent);




        

    }
}
