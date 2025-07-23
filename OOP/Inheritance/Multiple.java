package Inheritance;

//class derived from multiple base class 
//When one class implements more than one interface, it's called multiple inheritance.
// -> ambiguity problem

class Data{
    int a=100; //length
    int b=20; //breadth
}

class BasicCal{
    public void add(){
        System.out.println("Addition: " +(a+b));
    }
}


class Shape extends Data{
    public void rect(){
        System.out.println("Area: " +(a*b));
    }
}

public class Multiple {
    public static void main(String[] args) {
        
    }
}
