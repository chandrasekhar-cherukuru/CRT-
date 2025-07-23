package WrapperClass;

//used to convert inputs data over the different system


//1 -> valueOf()

//used to comvert primitive type to wrapper object
//similar to constructor

public class UtilityMethods {
    public static void main(String[] args) {
        
        //1 -> valueOf - method -> primitive to wrapper

        //This method:

        //Returns an Integer object from a cache if the value is between -128 to 127.
        //Is more efficient because it may reuse existing objects instead of creating new ones.

        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(20);

        System.out.println(i1 + i2);

        Integer i3 =  new Integer(10);
        Integer i4 = new Integer("20");

        System.out.println(i3 + i4);

        // valueOf() uses cache
        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);

        // new Integer() creates new object
        Integer x = new Integer(100);
        Integer y = new Integer(100);

        System.out.println("a == b : " + (a == b)); // true (from cache)
        System.out.println("x == y : " + (x == y)); // false (new objects)
        System.out.println("a == x : " + (a == x)); // false (different objects)

        System.out.println("a.equals(b): " + a.equals(b)); // true
        System.out.println("x.equals(y): " + x.equals(y)); // true

        //xxxValue() -> wrapper to primitive
        Integer a2 = Integer.valueOf(100);
        int primitiveA = a2.intValue(); // Converts Integer to int
        
        Double d = Double.valueOf("12.5");
        double primitiveD = d.doubleValue(); // Converts Double to double

        //parsexxx - wrapper(string) -> primitive type
        
    }
}
