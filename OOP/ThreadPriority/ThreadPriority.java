package ThreadPriority;

//in java every thread has priority explicitly provided by programmer or 

//the valid range of thread priority is 1 to 10
//1 is least priority and 10 is highest


//highest priority will execute first

//if they have same priority either one will execute -> depends on thread schedular
//we cant expect any execution order or exact output

// ex: 


//methods

//public final int getPriority()
//public void setPriority(int new priority)

//illegal argument exception is thrown when we give priority more than 10


//program to display thread prioeity in java

//thread - 2
class UserThread extends Thread{
    public void run(){
        System.out.println("User Thread ");
    }
}

//thread - 1
public class ThreadPriority {
    public static void main(String[] args) {
        UserThread ut1 = new UserThread();


        //to get priority of curren thread in main class
        //use  Thread.currentThread().getPriority()

        System.out.println("Main thread priority: " +Thread.currentThread().getPriority());
        System.out.println("User thread priority: " +ut1.getPriority());


        ut1.setPriority(10);
        Thread.currentThread().setPriority(3);
        
        // ut1.start();

        System.out.println("After thread pririty modifications");
        System.out.println("Main thread priority: " +Thread.currentThread().getPriority());
        System.out.println("User thread priority: " +ut1.getPriority());

        System.out.println("Default names by JVM");
        System.out.println("Main Thread name: " + Thread.currentThread().getName());
        System.out.println("User Thread name: " +ut1.getName());

        Thread.currentThread().setName("Home Page");
        ut1.setName("Bus Thread - 1");
        System.out.println("User threads by programmer");
        System.out.println("Main Thread name: " + Thread.currentThread().getName());
        System.out.println("User Thread name: " +ut1.getName());


    }
}


//to set and get name of thread

//public final void setName(String name)
//public final String getName()