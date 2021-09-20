package bj_2504;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int mul = 1, result = 0; // @1
        Stack<Character> stack = new Stack<Character>(); // @2
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) { // @3
                // @4
                case '(':
                    stack.push('(');
                    mul *= 2;
                    break;
                // @5
                case '[':
                    stack.push('[');
                    mul *= 3;
                    break;
                // @6
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        result = 0;
                        break;
                    }

                    if (str.charAt(i - 1) == '(') {
                        result += mul;
                    }
                    stack.pop();
                    mul /= 2;
                    break;
                // @7
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        result = 0;
                        break;
                    }

                    if (str.charAt(i - 1) == '[') {
                        result += mul;
                    }
                    stack.pop();
                    mul /= 3;
                    break;
            }
        }

        // @8
        System.out.println(!stack.isEmpty() ? 0 : result);
    }
}