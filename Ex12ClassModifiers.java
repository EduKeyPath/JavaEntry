package JavaEntry;

// public:  The class is accessible by any other class.
// default:  The class is only accessible by classes in the same package.
// private:  The code is only accessible within the declared class.
// protected:  The code is accessible in the same package and subclasses. 
// final:  The class cannot be inherited by other classes
// abstract:  The class cannot be used to create objects (To access an abstract class, it must be inherited from another class).


abstract class AbstractClass {
    String absAtr = "Abastract Attribute";
    short year = 2025;
    abstract void absmethod();
}

class ForAbstractUse extends AbstractClass {  // Inherit the abstract class with the extends keyword
    short day = 5;
    void absmethod(){
        System.out.println("This is an abstract method");
    }
}

public class Ex12ClassModifiers {
    final int x = 15;
    private String fullName = "Test"; // We can access the private attribute in the same class object

    private String getName(){ // We can access the private Getter Method in the same class object
        return fullName;
    }

    public void setName(String newName){  // Setter Method
        this.fullName = newName;
    }

    static String staticMethod(){
        return "I am static method, and will call without creating object.";
    }

    public String publicMethod(){
        return "I am public method, will call with object only";
    }

    public static void main(String[] args){
        // System.out.println(x); // we can't access the class attribute directly, can access with creating object.

        Ex12ClassModifiers modifierObj = new Ex12ClassModifiers();
        // modifierObj.x = 40;    // we can oberride value to a final varaiable.
        System.out.println(modifierObj.x); // we can access the class attribute with creating object.
        System.out.println(modifierObj.fullName);
        modifierObj.setName("Banti Shaw");
        System.out.println(modifierObj.getName());

        Ex12ClassModifiersEncap encapObj = new Ex12ClassModifiersEncap();
        // System.out.println(encapObj.fullName);  // we can't access the private attribute directly
        encapObj.setName("Java Excapsulation");
        System.out.println(encapObj.getName());


        System.out.println(staticMethod());
        System.out.println(modifierObj.publicMethod());

        //Using the abstract class
        ForAbstractUse absObj = new ForAbstractUse();
        System.out.println(absObj.absAtr);
        System.out.println(absObj.day);
        absObj.absmethod();

    }
}
