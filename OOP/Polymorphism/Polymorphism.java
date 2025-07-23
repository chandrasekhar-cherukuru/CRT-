// Polymorphism in Java means the same method can behave differently based on the object that calls it.

class Animal {
    // Base class method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method overriding: same method name and parameters as in Animal class,
    // but different behavior specific to Dog.
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Method overriding: same method name and parameters as in Animal class,
    // but different behavior specific to Cat.
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a;  // Reference variable of type Animal (parent class)

        a = new Dog();  // a refers to a Dog object

        // At runtime, JVM checks the actual object type (Dog),
        // so Dog's overridden sound() method is called.
        a.sound();      // Output: Dog barks

        a = new Cat();  // a now refers to a Cat object

        // At runtime, JVM checks the actual object type (Cat),
        // so Cat's overridden sound() method is called.
        a.sound();      // Output: Cat meows

        // This behavior is called runtime polymorphism (dynamic method dispatch).
        // The method call is resolved at runtime based on the actual object's class,
        // not the reference type.
    }
}

// Runtime polymorphism (Method Overriding):
// - Same method name and same parameters in parent and child classes.
// - The method that gets called is decided at runtime depending on the actual object.
// - This allows one interface (Animal reference) to be used for multiple forms (Dog, Cat).
