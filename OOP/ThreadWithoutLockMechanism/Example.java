package ThreadWithoutLockMechanism;


//Bus seat selection

//works like multithreading

// Remove or correct the package declaration if needed
// package ThreadWithoutLockMechanism;


//synchronized is used to ensure that 
//only one thread can access a method or block of code at a time on the same object.


class Table {
   synchronized public void PrintTable(int num) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }
}

class User1 extends Thread {
    Table t1;

    public User1(Table t) { // constructor
        this.t1 = t;
    }

    public void run() {
        t1.PrintTable(1);
    }
}

class User2 extends Thread {
    Table t2;

    public User2(Table t) {
        this.t2 = t;
    }

    public void run() {
        t2.PrintTable(5);
    }
}

public class Example {
    public static void main(String[] args) {
        Table table = new Table();
        User1 u1 = new User1(table);
        User2 u2 = new User2(table);
        u1.start();
        u2.start();
    }
}

//write a program to implement synchronized block and 
//static synchronization for math table applicatio