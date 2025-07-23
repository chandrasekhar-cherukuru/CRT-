package Collections.Stack;

// LIFO - Last In First Out

import java.util.Stack;
public class Example {
    public static void main(String[] args) {

        Stack stack = new Stack();
        for(int i = 1; i < 11; i++){

            if(i == 2){
                stack.push("Chakri");
            }else{
                stack.push(i);
            }
        }

        System.out.println(stack);
        while(stack.size() > 5){
            stack.pop();
        }
        System.out.println(stack);
        System.out.println(stack.size());
        stack.add(6);
        System.out.println(stack);
        System.out.println(stack.search("Chakri"));

    }
}
