package Generics;

class Data <T> { //used generics <T>
    T var; // allowing it to store any type (int, double, String, etc.).

    public void setData(T value){
        this.var = value;

    }

    public T getData(){
        return var;
    }
}

public class Example {
    public static void main(String[] args) {
        
        // Data dInt = new Data();
        // dInt.setData(10.5);
        // dInt.setData(100);
        // dInt.setData(10.5); // we can use generics here

        Data<Integer>  dInt = new Data<Integer>();
        dInt.setData(1000);
        System.out.println("Output: " +dInt.getData());

        Data<String> dString = new Data<String>();
        dString.setData("Hi");

        System.out.println("Output: " +dString.getData());

        Data<Boolean> dBoolean = new Data<Boolean>();
        dBoolean.setData(true);
        System.out.println("Output: " +dBoolean.getData());
    }
}
