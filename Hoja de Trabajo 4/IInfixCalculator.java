/**
 * @author:Marcela Cordon 
 * 
 * @since:21/01/2023
 **/

 import structure5.*;
 
 public static String infixToPostfix(String infix) {
    StringBuilder postfix = new StringBuilder();
    Stack<Character> stack = new Stack<>();
    stack.push('#'); // initially push some special character into the stack

    for (int i = 0; i < infix.length(); i++) {
        char ch = infix.charAt(i);
        if (Character.isLetterOrDigit(ch)) {
            postfix.append(ch); // add ch to postfix expression
        } else if (ch == '(') {
            stack.push(ch); // push ( into stack
        } else if (ch == '^') {
            stack.push(ch); // push ^ into the stack
        } else if (ch == ')') {
            while (stack.peek() != '(') { // while stack is not empty and stack top ≠ (
                postfix.append(stack.pop()); // pop and add item from stack to postfix expression
            }
            stack.pop(); // pop ( also from the stack
        } else {
            while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                postfix.append(stack.pop()); // pop and add into postfix expression
            }
            stack.push(ch); // push the newly coming character
        }
    }

    while (stack.peek() != '#') { // while the stack contains some remaining characters
        postfix.append(stack.pop()); // pop and add to the postfix expression
    }

    return postfix.toString();
}

private static int precedence(char ch) {
    if (ch == '^') {
        return 3;
    } else if (ch == '*'  ch == '/') {
        return 2;
    } else if (ch == '+'  ch == '-') {
        return 1;
    } else {
        return 0;
    }
}
