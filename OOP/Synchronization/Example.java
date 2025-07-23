package Synchronization;

// Table class with both instance and static synchronized methods/blocks
class Table {
    // Synchronized block (object-level lock)
    void printTable(int num) {
        synchronized(this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }
    }

    // Static synchronized method (class-level lock)
    static synchronized void printStaticTable(int num) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Static: " + num + " * " + i + " = " + (num * i));
        }
    }
}

class User1 extends Thread {
    Table t1;
    public User1(Table t) { this.t1 = t; }
    public void run() {
        t1.printTable(2); // uses synchronized block
    }
}

class User2 extends Thread {
    public void run() {
        Table.printStaticTable(3); // uses static synchronization
    }
}

public class Example {
    public static void main(String[] args) {
        Table table = new Table();
        User1 u1 = new User1(table);
        User2 u2 = new User2();
        u1.start();
        u2.start();
    }
}