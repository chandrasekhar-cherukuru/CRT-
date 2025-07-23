package MultiThreading;

class CustomThread extends Thread{
    
    public void run(){
        System.out.println("Thread2 is runnig");
    }
}

public class Example {
    public static void main(String[] args) {

        CustomThread t1 = new CustomThread();
        t1.run();

        System.out.println("Thread1 is running");
    }
}
