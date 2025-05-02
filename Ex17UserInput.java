package JavaEntry;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Scanner class is used to get user input, and it is found in the java.util package.
// nextBoolean()	Reads a boolean value from the user
// nextFloat()	Reads a float value from the user
// nextInt()	Reads a int value from the user
// nextLine()	Reads a String value from the user

public class Ex17UserInput {
    public static void main(String[] args){
        LocalDate dateObj = LocalDate.now();
        LocalTime timeObj = LocalTime.now();
        System.out.println("Date - " + dateObj + ", Time - " + timeObj);

        LocalDateTime dateTimeObj = LocalDateTime.now();
        System.out.println(dateTimeObj);

        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-mm-yyyy  hh:mm");
        String formattedDateTime = dateTimeObj.format(formatDateTime);
        System.out.println(formattedDateTime);


        try(Scanner userObj = new Scanner(System.in)){
            // System.out.println("Enter Your Name");
            // String userName = userObj.nextLine();
    
            // System.out.println("Enter your age");
            // short userAge = userObj.nextShort();
    
            // System.out.println("Enter your salary");
            // float userSalary = userObj.nextFloat();
    
            // System.out.println("User name is " + userName);
            // System.out.println("User age is " + userAge);
            // System.out.println("User salary is " + userSalary);
            
        };
    }
}
