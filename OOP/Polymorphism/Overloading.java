package Polymorphism;

/*
 * Method Overloading:
 * - A form of compile-time polymorphism (also called static polymorphism).
 * - Allows multiple methods in the same class with the same name but different parameter lists
 *   (different number, type, or order of parameters).
 * - The compiler determines which method to call based on the method signature (method name + parameters).
 * - This decision is made during **compile time** (before running the program).
 * - It improves code readability and flexibility.
 */

class Addition {

    // Method 1: adds two integers
    public void add(int a, int b) {
        System.out.println("Addition is: " + (a + b));
    }

    // Method 2: adds three integers - different number of parameters
    public void add(int a, int b, int c) {
        System.out.println("Addition is: " + (a + b + c));
    }

    // Method 3: adds integer and double - different parameter types
    public void add(int a, double b) {
        System.out.println("Addition is: " + (a + b));
    }

    // Method 4: concatenates two strings - different parameter types
    public void add(String s1, String s2) {
        System.out.println("Addition is: " + (s1 + " " + s2));
    }
}

public class Overloading {
    public static void main(String[] args) {
        Addition addition = new Addition();

        // The compiler checks the method signature: add(int, int)
        // Calls the first add method
        addition.add(1, 2);

        // The compiler checks the method signature: add(int, int, int)
        // Calls the second add method
        addition.add(1, 2, 3);

        // The compiler checks the method signature: add(int, double)
        // Calls the third add method
        addition.add(1, 2.2);

        // The compiler checks the method signature: add(String, String)
        // Calls the fourth add method
        addition.add("Hi", "Hello!");
    }
}
