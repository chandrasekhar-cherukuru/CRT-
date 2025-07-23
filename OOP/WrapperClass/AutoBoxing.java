package WrapperClass;

//Auto Boxing ->
//automatic conversion of primitive tyoes into their corresponding wrapper classes

//Ex




//Auto Unboxing
////automatic conversion of wrapper class objects back to primitve types
/// 
public class AutoBoxing {
    public static void main(String[] args) {
        
        //AutoBoxing
        int a = 10;
        int b = 70;
        Integer aWrapper = a;
        Integer bWrapper = b;
        System.out.println("Class Object a: " +aWrapper);
        System.out.println(aWrapper.getClass());
        System.out.println(aWrapper * bWrapper);


        //Autp Unboxing
        Double dWrapper = 10.5;
        double d = dWrapper;
        System.out.println(d);
    }
}
