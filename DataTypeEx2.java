package JavaEntry;

// For compile and create the class, first run in the command - (your-path/javac DataType.java)
// For run the compile class in the command - (your-path/java DataType)

public class DataTypeEx2 {
    public static void main(String[] arg){
        // Let's explore primitive datatype - Integer Type (byte, short, int, long), Floating Point(float, double), boolean and char
        // Non-Primitive datatype - String, Arrays and Classes
        
        // byte - Stores whole numbers from   -128 to 127
        // short	Stores whole numbers from    -32,768 to 32,767
        // int	Stores whole numbers from     -2,147,483,648 to 2,147,483,647
        // long	Stores whole numbers from   -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float	Stores fractional numbers. Sufficient for storing   6 to 7 decimal digits
        // double	Stores fractional numbers. Sufficient for storing   15 to 16 decimal digits
        // boolean	Stores   true or false values
        // char	Stores a   single character/letter or ASCII values

        byte byteRupee = 100;
        short shortNumber = 5000;
        int intNumber = 10000;
        long longNumber = 15000000000L;
        float floatNumber = 35e3f;
        double doubleNumber = 12E4d;
        boolean isNumber = true;
        boolean checkNumber = 10 < 5;
        boolean isEqual = 10 == 5;
        char charText = 'D';
        char chatTextNumber = 65;
        String wordText = "Primitive Data Type";  //non-primitive types typically starts with an uppercase

        System.out.println("Byte Ex: " + byteRupee + ", ");
        System.out.println("Short Ex: " + shortNumber + ", ");
        System.out.println("Int Ex: " + intNumber + ", ");
        System.out.println("Long Ex: " + longNumber + ", ");
        System.out.println("Float Ex: " + floatNumber + ", ");
        System.out.println("Double Ex: " + doubleNumber + ", ");
        System.out.println("Boolean Ex: " + isNumber + ", ");
        System.out.println("Boolean Ex 2: " + checkNumber + ", ");
        System.out.println("Boolean Ex 3: " + isEqual + ", ");
        System.out.println("Char Ex: " + charText + ", ");
        System.out.println("Char Ex2: " + chatTextNumber + ", ");
        System.out.println("String Ex2: " + wordText + ", ");

        byte productQty = 20;
        float productPrice = 75.00f;
        float totalPrice = 1500.00f;
        char rupee = '₹';

        System.out.println("The product qty is " + productQty + 
            ", the price of the product is " + productPrice + 
            ", so total amount will be " + totalPrice +
            ", and the price need to pay in " + rupee);
        

    }
}