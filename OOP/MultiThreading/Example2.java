package MultiThreading;


class CustomThreadd extends Thread{
    @Override
    public void run(){
        System.out.println("In custom Thread");
    }
}
public class Example2 {
    public static void main(String[] args) {
        CustomThreadd  t1 = new CustomThreadd();
        t1.start();
        System.out.println("In thread main thread");
    }
}
