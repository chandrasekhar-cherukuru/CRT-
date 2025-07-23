
// process of aquiring properties(varibles) and behaviours(methods) of another class

//multiple inheritance can be done using interfaces

// single level inheritance
// -> class is derived from one base class

class Parent{ //parent /Base / super class
    
    double money = 100000.0;
    public void assets() {
        System.out.println("Parent Assets: " +money);
    }
}

class Child extends Parent{ //child/derived/sub class
    double liabilities = 50000.0;
    public void remaining(){
        System.out.println("Child assets: " +money);
        System.out.println("Child have: " +(money - liabilities));

    }
}



public class Inheritance {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        parent.assets();
        child.remaining();
    }
}
