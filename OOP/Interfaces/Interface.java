

//Interface is a collection of zero or more abstract method(incomplete methods) which ends with semicolan and does not have any body

// by default every abstract method is a public and abstract


//class -> class = extends

//interface -> class = implements

//interface -> interface = extends

//class -> inetrface X (dont work)


//we cant put semicolan for class methods
// class A {
//     void show() {}
// }

// class B {
//     void show() {}
// }

// // ❌ This will cause a compile-time error
// class C extends A, B {
//     // not allowed
// }



interface A{

    //Abstarct method
    abstract void display(); //incomplete

}

class B implements A{
    public void display(){
        System.out.println("Weclcome to Java Class");
    }
}

class C implements A{
    public void display(){
        System.out.println("Addition: " +(10 + 20));
    }
}


public class Interface {
    public static void main(String[] args) {
       // A a = new A();
       //we cannot create an object of an interface in Java directly.
        
        B b = new B();
        b.display();

        C c = new C();
        c.display();

    }
}


//child possible height by using parents height

interface Father{
    double fh = 5.8;
}

interface Mother{
    double mh=5.6;
}

interface Child extends Father, Mother{
    public void childHeight();
}

class Height implements Child{

    public void childHeight() {
        System.out.println("Avg. Child Height: ");
    }

}


//listed hybrid inheritance using interfaces