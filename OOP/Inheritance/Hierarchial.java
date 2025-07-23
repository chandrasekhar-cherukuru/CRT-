
//multiple classes are derived from one base class is called hierachial inheritance

class Data{
    int a=100; //length
    int b=20; //breadth
}

class BasicCal extends Data{
    public void add(){
        System.out.println("Addition: " +(a+b));
    }
}


class Shape extends Data{
    public void rect(){
        System.out.println("Area: " +(a*b));
    }
}
public class Hierarchial {
    public static void main(String[] args) {
        
        BasicCal cal = new BasicCal();
        cal.add();

        Shape sp = new Shape();
        sp.rect();
        
    }
}
