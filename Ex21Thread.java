package JavaEntry;

// Threads allows a program to doing multiple things at the same time.
// It can be created by extending the Thread class and overriding its run() method.
// Another way to create a thread is to implement the Runnable interface.
// The major difference is that when a class extends the Thread class, you cannot extend any other class, but by implementing the Runnable interface, it is possible to extend from another class as well

// Example extending the Thread
// public class Ex21Thread extends Thread {
//     public static void main(String[] args){
//         Ex21Thread creatingThread = new Ex21Thread();
//         creatingThread.start();
//         System.out.println("Thread start, but this code is running outside the thread");
//     }
//     public void run(){
//         System.out.println("This code is running in a thread");
//     }
// }


// Example implement the Thread interface
public class Ex21Thread implements Runnable {
    public static void main(String[] arg){
        Ex21Thread threadObj = new Ex21Thread();
        Thread creatingThread = new Thread(threadObj);
        creatingThread.start();
        System.out.println("Thread start, but this code is running outside the thread");
    }

    public void run(){
        System.out.println("This code is running in a thread");
    }
}
