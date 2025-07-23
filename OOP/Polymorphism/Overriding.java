package Polymorphism;

//same name same paramentres
//used for updation

//it came from inheritanc

//works after inheritance

//parent class methods are called as overridden methods
//child class methods are called as overriding methods


class Android14{
    public void feature(){
        System.out.println("Default ScreenSavers");
    }
}

class Android15 extends Android14{
    public void feature(){ //overriding
        
        System.out.println("Customized ScreenSaver");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Android14 a14 = new Android15();

        //method overriding
        a14.feature();
    }
}
