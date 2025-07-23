
//we can do it using classes by single and hierarchial inheritances

interface IA{ //interface 1
    void showA();
}

interface IB{
    void showB();
}

class HC implements IA, IB{ // class C extends both interfaces A and B -> multiple inheritance
    public void showA(){
        System.out.println("In showA method from Interface IA");
    }

    public void showB(){
        System.out.println("In showA method from Interface B");
    }

    public void showC(){
        System.out.println("In showA method from Interface C");
    }
}

class HD extends HC{
    public void showD(){
        System.out.println("In showA method from Class D");
    }
}



public class HybridInterface {
    public static void main(String[] args) {
        HD obj = new HD();
        obj.showA();
        obj.showB();
        obj.showC();
        obj.showD();
    }
}
