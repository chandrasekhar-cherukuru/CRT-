
import java.lang.classfile.instruction.ThrowInstruction;



public class Test2 {

    String model;
    int speed=0;


    public void start(){
        System.out.println("Car is Started with speed of: " +speed);
    }

    //using this for current class variable
    //here speed is the current class variable
    
    public void speed(int speed){
        this.speed += speed;
        System.out.println("Car with speed of " +this.speed);
    }

    public void brake(int speed){

        this.speed -= speed;
        System.out.println("Car with speed of " +this.speed);
    }

     public void accelarate(int speed){

        this.speed += speed;
        System.out.println("Car with speed of " +this.speed);
    }
    public static void main(String[] args) {
        
        Test2 audi = new Test2();
        audi.model = "Audi R8";

        //what is instance here??
        audi.start();
        audi.accelarate(120);
        audi.accelarate(80);

        

    }
}
