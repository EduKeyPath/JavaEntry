package JavaEntry;

public class Ex5Condition {
    public static void main(String[] arg){

        // Check Simple condition
        short x = 10;
        short y = 20;
        if(x > y){
            System.out.println("X is greater than Y");
        }else {
            System.out.println("Y is greater than X");
        }

        // Check Multiple condition
        short currentTime = 14;
        if(currentTime < 10){
            System.out.println("Good Morning");
        }else if(currentTime > 10 && currentTime < 16){
            System.out.println("Good Afternnon");
        }else if(currentTime > 20){
            System.out.println("Good Night");
        }

        // Shorthand condition
        short age = 20;
        String isAdult = age >= 18 ? "Adult" : "Not Adult";
        System.out.println(isAdult);


        // Instead of writing many if..else statements, we can use the switch statement.
        short currentMonth = 5;
        switch (currentMonth) {
            case 1:
                System.out.println("Month is January");
                break;
            case 2:
                System.out.println("Month is February");
                break;
            case 3:
                System.out.println("Month is March");
                break;
            case 4:
                System.out.println("Month is April");
                break;
            case 5:
                System.out.println("Month is May");
                break;
            case 6:
                System.out.println("Month is June");
                break;
            case 7:
                System.out.println("Month is July");
                break;
            case 8:
                System.out.println("Month is August");
                break;
            case 9:
                System.out.println("Month is September");
                break;
            case 10:
                System.out.println("Month is October");
                break;
            case 11:
                System.out.println("Month is November");
                break;
            case 12:
                System.out.println("Month is December");
                break;
            default:
                System.out.println("Number is not a valid month");
                break;
        }
    }
}
