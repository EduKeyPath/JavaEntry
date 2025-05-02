package JavaEntry;

// Inheritance : use to inherit attributes and methods from another class.
// Polymorphism: uses the smae methods to perform different tasks.


class Student {
    String name = "Banti";
    String universityName = "SMU";
    void getFullName(){
        System.out.println(name + " Shaw");
    }
    public void whichClass(){
        System.out.println("I am in Class 10");
    }
}

class HigherEdu extends Student {
    public void whichClass(){
        System.out.println("I am in Class 12");
    }
}

class GraduateDegree extends Student {
    public void whichClass(){
        System.out.println("I am in College for Bachelor's Degree");
    }
}



class Ex14ClassInheritance extends Student {  // Inherit the abstract class with the extends keyword
    public static void main(String[] args){
        Student studentObj = new Student();
        studentObj.getFullName();
        System.out.println(studentObj.universityName);
        studentObj.whichClass();

        HigherEdu higherEduObj = new HigherEdu();
        higherEduObj.whichClass();
        
        GraduateDegree graduateDegreeObj = new GraduateDegree();
        graduateDegreeObj.whichClass();
    }
}
