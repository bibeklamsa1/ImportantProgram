package ReversingStack;

import java.util.ArrayList;
import java.util.Stack;

public class StackReversing {
    boolean flag = false;
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(50);
        stack.push(3);
        stack.push(1);
        StackReversing stkrev = new StackReversing();
        stkrev.reverseStack(stack);
        System.out.println(stack);
    }

    public void reverseStack(Stack<Integer> stack){
       Stack<Integer> stk = new Stack<>();
       while (!stack.isEmpty()){
           stk.push(stack.pop());
       }
        System.out.println("Deleted "+ stk.pop());
       while (!stk.isEmpty()){
           stack.push(stk.pop());
       }
    }
}
