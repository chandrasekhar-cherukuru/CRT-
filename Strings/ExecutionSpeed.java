public class ExecutionSpeed {
    public static void main(String[] args) {

        int n = 100;
        String str = "Hello";
        StringBuffer sbuffer = new StringBuffer("Hello");
        StringBuilder sbuilder = new StringBuilder("Hello");


        //for String

        // long start = System.currentTimeMillis();
        // System.out.println(start);
        // for(int i = 1; i <= 100; i++){

        //     str += "!";
            
        // }

        // long end = System.currentTimeMillis();
        // System.out.println(end - start);

        //for StringBuffer

        long start = System.currentTimeMillis();
        System.out.println(start);
        for(int i = 1; i <= 100009980; i++){

            sbuffer.append("!");
            
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);


        //for StringBuffer

        // long start = System.currentTimeMillis();
        // System.out.println(start);
        // for(int i = 1; i <= 100009980; i++){

        //     sbuilder.append("!");
            
        // }

        // long end = System.currentTimeMillis();
        // System.out.println(end - start);
        
    }
}
