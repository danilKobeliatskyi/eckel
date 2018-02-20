package danil.chapter11;

import java.util.Stack;

public class TestStack {
    TestStack(){
        Stack<Character> stack = new Stack<Character>();
        stack.push('U');
        stack.push('n');
        stack.push('c');
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push('e');
        stack.push('r');
        stack.push('t');
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push('a');
        stack.push('i');
        stack.push('n');
        stack.push('t');
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push(' ');
        System.out.print(stack.pop());
        stack.push('r');
        stack.push('u');
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push('l');
        stack.push('e');
        stack.push('s');
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
    }
}

