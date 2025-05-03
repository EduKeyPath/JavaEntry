package JavaEntry;

/*
Concurrency problems: Threads run at the same time as other parts of the program, there is no way to know in which order the code will run. 
When the threads and main program are reading and writing the same variables, the values are unpredictable. 
The problems that result from this are called concurrency problems.
*/

/* Avoid concurrency problems, use the isAlive() method of the thread to check whether the thread has finished
*/

public class Ex22Thread extends Thread {
    public static int amount = 0;
    public static void main(String[] arg){
        Ex22Thread customThread = new Ex22Thread();
        customThread.start();
        
        // Wait for the thread to finish
        while(customThread.isAlive()) {
            System.out.println("Waiting...");
        }
        
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }
    public void run(){
        amount++;
        System.out.println("threAD");
        amount++;
        amount++;
    }
}
