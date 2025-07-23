package PreventThreadFromExecution;

class UserThread extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("User Threadd- " +i);
        }

        try{
            Thread.sleep(3000); //sleep for 3sec
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        
        UserThread ut = new UserThread();
        ut.run();

        System.out.println("After 3 seconds");
    }
}
