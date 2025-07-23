package MultiThreading;


//By extending thread class
//there is inbuild run method

//thread - 2
class MyThread extends Thread{//overriding 

    public void run(){ //run() overRiding

        for(int i = 1; i <= 5; i++){//---> 2
            System.out.println("My thread- " +i);
        }
    }
}

// thread - 1
public class ExtendThread { //here class name is main thread 
                            //always main thread tries to execute first
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread();
        t1.start();//creating new Thread and executing 
        //some delay so it goes to ExtendThread class

        //run() -> directly executes
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Test-" +i);
        }
    }
}


//Thread Schedular
//if multiple threads are wwaiting for execution 
//which thread should be executed first is decided by thread schedular

//what algorithm, mechanism or behaviour use by thread schedular is depends of JVM vendor

//hence we canr expect any execution order or exact outpout in multithreading


