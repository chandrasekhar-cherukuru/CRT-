
public class Test {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();


        System.out.println("T1: " +t1.hashCode());
        System.out.println("T2: " +t2.hashCode());
        System.out.println("T3: " +t2.hashCode());
    }
}
