class MultipleCatch{
    public static void main(String[] args) {
        
        //try with multiple catch blocks
        //a try can have multiple catch blocks

        //if try contains multiple catch blocks then order of catch block is very important
        //it should be from child to parent but not from parent to child

        //Why? If a parent exception (like Exception or RuntimeException) comes 
        //before a child exception (like ArithmeticException or NullPointerException), 
        //the child catch block will never be reached, and the compiler will show an error.

        String str = null;
        int[] arr ={1, 2, 3};
        Object obj = "123";

        try {
            System.out.println(str.length());
            // System.out.println(str.length());
            // System.out.println(arr[5]);
            // int i = (int) obj;
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (NullPointerException ne) {
            ne.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException aie){
            aie.printStackTrace();
        } catch (Exception e) { // parent exception should be last
            e.printStackTrace();
        }
    }
}