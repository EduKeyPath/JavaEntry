package JavaEntry;
import java.util.ArrayList; 
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ex18ArrayList {
    public static void main(String[] args){

        // ArrayList: is a collection on element
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");  // Adding an element to the Array
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.add("Grapes");
        fruits.add("50");
        fruits.add(0, "Mango");  // Adding an element on 0 index to the Array
        fruits.set(2, "Himsagar Mango");  // Replace the first element on the Array
        fruits.remove(3);
        // fruits.clear();  // For clear all the Array element;

        System.out.println(fruits + ", Total fruits count is - " + fruits.size());
        System.out.println(fruits.get(1));  // Access the element with index.
        
        Collections.sort(fruits);   // For sort the array.
        // Printing all array element with loop
        System.out.println("Printing all array element with For loop -");
        for(int i = 0; i < fruits.size(); i++){
            System.out.print(fruits.get(i) + ", ");
        }

        System.out.println(" ");
        System.out.println("Printing with For Each -");
        for(String i : fruits){
            System.out.print(i + ", ");
        }


        // Use LinkedList to manipulate data and ArrayList for storing and accessing data.
        // LinkedList: class is a collection which can contain many objects of the same type, just like the ArrayList.
        System.out.println(" ");
        System.out.println("Linked List -");
        LinkedList<String> linkedObj = new LinkedList<String>();
        linkedObj.add("7");   // Adding an element to the Linked list
        linkedObj.add("1");  
        linkedObj.add("2");
        linkedObj.addFirst("9");
        linkedObj.addLast("5");
        // System.out.println(linkedObj.getLast());
        // Collections.sort(linkedObj);  // Sorting the array
        Collections.sort(linkedObj, Collections.reverseOrder());  // Reverse the array

        for(String i: linkedObj){
            System.out.print(i + ", ");
        }
        System.out.println(" ");


        // HashMap: store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
        HashMap<String, String> newElem = new HashMap<String, String>();
        newElem.put("a", "Apple");
        newElem.put("b", "Ball");
        newElem.put("c", "Cat");
        System.out.println(newElem + ", Total Element count is - " + newElem.size());
        // newElem.remove("b");   // For remove an element
        // newElem.clear();   // For remove all element
        System.out.println(newElem.get("a"));   // For access element with specific key

        System.out.print("Keys - ");
        for(String key : newElem.keySet()){
            System.out.print(key + ", ");
        }
        System.out.println(" ");
        System.out.print("Values - ");
        for(String val : newElem.values()){
            System.out.print(val + ", ");
        }

        System.out.println(" ");
        System.out.print("Key & Values - ");
        for(String key : newElem.keySet()){
            System.out.print(key.toUpperCase() + " for " + newElem.get(key) + ", ");
        }


        // HashSet is a collection of items where every item is unique
        System.out.println(" ");
        HashSet<Integer> alphabets = new HashSet<Integer>();
        alphabets.add(1);
        alphabets.add(2); // It will not add as A is already exist.
        // alphabets.remove(2);
        alphabets.add(3);
        alphabets.add(4);  // For check the element exist or not.
        // alphabets.clear(); // For clear all the element.
        System.out.println(alphabets.contains(3));

        for(int i=0; i<10; i++){
            if(!alphabets.contains(i)){
                alphabets.add(i);
            }
        }
        System.out.println(alphabets + ", Total no of element is - " + alphabets.size());


        // Iterator: is an object that can be used to loop through collections.
        Iterator<Integer> cusIterator = alphabets.iterator();
        System.out.println(cusIterator.next() + ", " + cusIterator.next());
        while (cusIterator.hasNext()) {
            System.out.print(cusIterator.next() + ", ");
        }
        

        System.out.println(" ");
        //Wrapper Classes : provide a way to use primitive data types (int, boolean, etc..) as objects.
        // byte	- Byte
        // short - Short
        // int - Integer
        // long - Long
        // float - Float
        // double - Double
        // boolean - Boolean
        // char - Character
        // Usefull because it is invalid (int not work): ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
        // ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.toString());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

    }
}
