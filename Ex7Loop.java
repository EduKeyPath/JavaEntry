package JavaEntry;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Ex7Loop {
    public static void main(String[] arg){

        // while loop: run through a block of code as long as a specified condition is true:
        short no = 0;
        while(no < 5){
            System.out.println("Current no. is " + no);
            no++;  // update the value, otherwise the loop will never end because no is always zero if not increase!
        }

        // Do-while loop: This loop will execute the code block once, before checking if the condition is true,
        // If true then it will repeat the loop as long as the condition is true.
        short dayInWeek = 7;
        short curDay = 0;
        do{
            curDay++;
            System.out.println("Day" + curDay);
        }
        while(curDay < dayInWeek);

        // ForLoop: exactly loop through a block of code for the mentioned condition
        System.out.println("ForLoop");
        for(short i=0; i < 5; i++){
            System.out.println(i);
        }

        // Nested ForLoop
        System.out.println("Nested ForLoop");
        for(short i=0; i<5; i++){
            System.out.println(i + "Parent");

            for(short j = 0; j < 2; j++){
                System.out.println(j + "Child");
            }
        }

        // ForEach Loop: loop through elements in an array;
        System.out.println("ForEach Loop");
        String[] fruits = {"Mango", "Orange", "Grapes", "Watermelon"};
        for(String item:fruits){
            System.out.println(item);
        }

        // Break: statement can be used to jump out of a loop if condition match.
        System.out.println("Break Statement");
        for(int i=0; i<5; i++){
            if(i==2){
                break;
            }
            System.out.println(i);
        }

        // Continue: statement can be used to jump out of a loop.
        System.out.println("Contniue Statement");
        for(int i=0; i<5; i++){
            if(i==2){
                continue;
            }
            System.out.println(i);
        }
    }
}
