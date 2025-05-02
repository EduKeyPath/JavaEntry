package JavaEntry;
// For compile and create the class, first run in the command - (your-path/javac Entry.java)
// For run the compile class in the command - (your-path/java Entry)

public class Ex1Entry {
    public static void main(String[] arg){
        // It will print next to next line
        System.out.println("Let's enter in the Java World");
        System.out.println("Seccond Line");

        // It will print in the same line
        System.out.print("A");
        System.out.print("B");
        System.out.print("C ");

        System.out.println(" "); // Just for a line break

        // For print Number
        System.out.println( 2 * 5 );


        /* Now Creating different type of variable and print */
        String myName = "Banti";
        int myMobNo = 123;
        myMobNo = 234; // we can reassign value;
        final int myMob = 987;   // we can't reassign value with final keyword;
        float money = 10.11f;
        char meyFirstLetter = 'B';
        boolean printStatus = true;
        System.out.println(myName + ", " + myMobNo + ", " + myMob + ", " + money + ", " + meyFirstLetter + ", " + printStatus);

        // let's do some calculation
        int x = 10;
        int y = 5;
        System.out.println("Addition - " + (x + y));  //Addition
        System.out.println("substraction - " + (x - y)); // substraction
        System.out.println("Multiply - " + (x * y));  // Multiply
        System.out.println("Division - " + (x / y)); //Division
        System.out.println("Modulus - " + (x % y)); //Modulus
        System.out.println("Increment - " + (++x)); //Increment - it's 11 because its update first then print x value
        System.out.println("Increment2 - " + (x++)); //Increment - it's also 11 because its print the x value then update
        System.out.println("Decrement - " + (x--)); //Decrement - as x is update the prev line x is 12, but decrease value after print
        System.out.println("Decrement2 - " + (--x)); //Decrement - here 10, as already decrease previous line, and here also decrease before print.


        System.out.println("Addition - " + (x += y));  // x = x + y, here x is now 15;
        System.out.println("Multiply - " + (x *= y));  // x = x * y, as x is 15, now 15 * 5 = 75;

    }
}