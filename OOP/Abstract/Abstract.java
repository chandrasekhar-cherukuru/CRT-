package Abstract;

// ❗ Abstract class: allows both abstract (incomplete) and concrete (complete) methods
// ✅ Used here because we need to store variables (len, wid)
// ❌ This can't be done with an interface, since interfaces can't store instance variables


//wd cant achieve multiple inheritance


abstract class Shape {
    int len;
    int wid;

    // 🔹 Abstract method: must be implemented by subclasses
    abstract void data(int l, int w);

    // 🔹 Concrete method: uses len and wid to calculate area
    public void display() {
        System.out.println("Area of the shape: " + (len * wid));
    }
}

// ✅ Inheriting and providing implementation for abstract method
class Square extends Shape {
    public void data(int l, int w) {
        len = l;
        wid = w;
    }
}

// ✅ Another subclass inheriting and implementing abstract method
class Rectangle extends Shape {
    public void data(int l, int w) {
        len = l;
        wid = w;
    }
}

// 🔰 Main class to test everything
public class Abstract {
    public static void main(String[] args) {

        // Create Square object, assign data, display area
        Square square = new Square();
        square.data(2, 2);
        square.display(); // Output: Area of the shape: 4

        // Create Rectangle object, assign data, display area
        Rectangle rec = new Rectangle();
        rec.data(2, 4);
        rec.display(); // Output: Area of the shape: 8
    }
}
