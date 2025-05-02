package JavaEntry;

// abstract class: using it we hiding certain details and showing only essential information to the user.
// Interfaces, hide certain details and only show the important details of an object.

abstract class UserDetails {
    String name = "Banti Shaw";
    String universityName = "SMU";
    String getUserDetails(){
        return name + " " + universityName;
    }
}

class ForUseUserDetails extends UserDetails {
    public String getName = getUserDetails();
}

interface Student {
    String name = "Ganesh";
    String universityName = "Unknown";
    default String getStudentDetails(){
        return name;
    }
}

class ForInterfaceUse implements Student {
    public String studentName = getStudentDetails();
}

// enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
enum Process {
    TODO,
    INDEVELOPMENT,
    REVIEW,
    DONE
}

public class Ex16ClassAbsInterface {
    public static void main(String[] args){
        // UserDetails userObj = new UserDetails();  // We can't create the object with abstract class.
        ForUseUserDetails extendedUserObj = new ForUseUserDetails(); 
        System.out.println(extendedUserObj.getName);

        ForInterfaceUse interfaceStudentObj = new ForInterfaceUse();
        System.out.println(interfaceStudentObj.studentName);
        
        Process currState = Process.TODO;
        Process devState = Process.INDEVELOPMENT;
        System.out.println(currState + " " + devState);

        switch(currState){
            case TODO:
                System.out.println("Work is on " + currState + " state");
            break;
            case INDEVELOPMENT:
                System.out.println("Work is on " + currState + " state");
            break;
            case REVIEW:
                System.out.println("Work is on " + currState + " state");
            break;
            case DONE:
                System.out.println("Work is on " + currState);
            break;
            default:
            System.out.println("No Work");
            break;
        }

        for(Process enumItem : Process.values()){
            System.out.println("Process name - " + enumItem);
        }

    }
}
