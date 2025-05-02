package JavaEntry;

public class Ex8Array {
    public static void main(String[] arg){
        String[] fruits = {"Mango", "Apple", "Watermelon", "Orange"};
        fruits[0] = "Grapes"; //Replace the first element from Mango to Grapes;
        System.out.println(fruits[0] + ", Total no of element is: " + fruits.length);  //Print the first element and total element

        // ForLoop: for the Array, which will continue till the last element.
        System.out.println("For Loop Iteration -");
        for(int i=0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        // ForEach: for the Array, which will print all element.
        System.out.println("For Each Iteration -");
        for(String i:fruits){
            System.out.println(i);
        }

        // Multidimensional Arrays
        int [][] numArr = {{1,2,3,4,5}, {6,7,8,9,10}};

        // Printing each element in Multidimension Arrays
        System.out.println("Multidimension Arrays with ForLoop - "); //For Loop
        for(int i=0; i < numArr.length; i++ ){
            for(int j=0; j<numArr[i].length; j++){
                System.out.println(numArr[i][j]);
            }
        }

        System.out.println("Multidimension Arrays with ForEach - "); //For Each
        for(int[] arrs: numArr){
            for(int elem:arrs){
                System.out.println(elem);
            }
        } 
        
        System.out.println("Accessing Arrays element - ");
        System.out.println(numArr[1][0]);  // Accessing Second array, first element.
        numArr[0][0] = 11; // Replace First array, first element value.
        System.out.println(numArr[0][0]);  // Accessing First array, first element.

    }
}
