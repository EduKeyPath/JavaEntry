package JavaEntry;

class Student {
    String name = "Banti";
    String universityName = "SMU";
    void getFullName(){
        System.out.println(name + " Shaw");
    }
}

class Ex14ClassInheritance extends Student {  // Inherit the abstract class with the extends keyword
    public static void main(String[] args){
        Student studentObj = new Student();
        studentObj.getFullName();
        System.out.println(studentObj.universityName);
    }
}
