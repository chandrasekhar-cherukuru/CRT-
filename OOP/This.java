

//this -> refer to current class object reference

//three ways

// to refer current class variables
// to refer current class methods
// to refer current class constructors

// public class This {
    

//     int a = 10;
//     int b = 20;
    
//     public This(int A, int B){
//         System.out.println(a+ " "+b);
//         this.a=A;
//         this.b=B;
//         System.out.println(a+ " " +b);
//     }
//     public static void main(String[] args) {
        
//         This obj = new This(100, 200);
//     }
// }


public class This {
    

    public void m1(){
        System.out.println("Method - 1");
    }

    public void m2(){
        System.out.println("Method - 2");
        this.m1(); //calling the m1 by 'this' keyword
    }
    public static void main(String[] args) {
        
        This obj = new This();
        obj.m1();
    }
}
