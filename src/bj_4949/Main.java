package bj_4949;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();

            if (str.equals(".")) {
                break;
            }

            System.out.println(solve(str));

        }
    }

    public static StringBuilder solve(String str) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {

            if (flag) {
                if (str.charAt(i) == '.') {
                    flag = false;
                }

                continue;
            }

            if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if(stack.empty() || stack.peek() != '(') {
                    sb.append("no");
                    flag = true;
                }
                else {
                    stack.pop();
                }
            } else if (str.charAt(i) == ']') {
                if(stack.empty() || stack.peek() != '[') {
                    sb.append("no");
                    flag = true;
                }
                else {
                    stack.pop();
                }
            } else if (str.charAt(i) == '.') {
                if (stack.isEmpty()) {
                    sb.append("yes");
                } else {
                    sb.append("no");
                }
                stack.clear();
            }
        }

        return sb;

    }

}
