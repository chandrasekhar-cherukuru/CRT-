package MultiThreading;



//Thread Schedular
//if multiple threads are wwaiting for execution 
//which thread should be executed first is decided by thread schedular

//what algorithm, mechanism or behaviour use by thread schedular is depends of JVM vendor

//hence we canr expect any execution order or exact outpout in multithreading

//if we call t.run() method then no new thread will be created by MyThread class run() method
//will execute just like normal method

class MyThread extends Thread{//overriding 

    public void run(){ //run() overRiding(Application logic)

        for(int i = 1; i <= 5; i++){//---> 2
            System.out.println("My thread- " +i);
        }
    }
}



public class ThreadSchedular {
    public static void main(String[] args) {
        MyThread app1 = new MyThread();
        app1.run(); //run() -> executing app1 thread first

        for(int i = 1; i <= 5; i++){
            System.out.println("Test-" +i);
        }
    }
}


//if we dont override run() method??

// -> if we dont override run() method then 
// t.start() method executes Thread class run() mehtod executes automatically

//thread class run() method is a empty


//life cycle
// NEW → RUNNABLE → RUNNING → WAITING/BLOCKED/TIMED_WAITING → TERMINATED
