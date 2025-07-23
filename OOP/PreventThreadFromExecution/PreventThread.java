package PreventThreadFromExecution;

//pause current execution thread and will give change to other threads which have same priority 
//if there is no waiting threads then current thread will continue its execution
//if multiple threads have same priority then we cant expect which one will execute first
//becaus it is managed by thread schedular

//refer it by scope of the block


//1 -> yield()

class UserThread1 extends Thread{
    public void run(){
        System.out.println("User Thread - 1");
    }
}

class UserThread2 extends Thread{
    public void run(){
        System.out.println("User Thread - 2");
    }
}

public class PreventThread {
    public static void main(String[] args) {
        UserThread1 ut1 = new UserThread1();
        UserThread2 ut2 = new UserThread2();

        ut1.start();
        ut2.start();

        for(int i = 0; i < 5; i++){
            Thread.currentThread().yield();
            System.out.println("Main Thread: " +i);
        }
    }
}


//example - pubj gameplay

//2 -> join()

//if the thread want to wait until the completion of some other thread then we need to use join method


//3 ->  sleep()

//if thread dont want to perform any opertation for particular amount of time then wen need to use sleep method

// throws one checked exception