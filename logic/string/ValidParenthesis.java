package logic.string;      //  SUBMITTED 20.LEETCODE

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {    
        String s = "([}}])";
        System.out.println(validate(s));
    }

    private static boolean validate(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (aChar == '{' || aChar == '[' || aChar == '(') {
                stack.push(aChar);
            } else if (aChar == '}' || aChar == ']' || aChar == ')') {
                if (stack.empty() || chars.length%2 != 0) {
                    return false;
                }else if (aChar == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                } else if (aChar == '}') {
                    if (stack.peek() == '{' ) {
                        stack.pop();
                    } else  {
                        return false;
                    }
                } else {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }

}
