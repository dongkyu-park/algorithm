package bj_10799;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        String str = sc.next();

        int answer = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                stack.push(i);
            } else if (str.charAt(i) == ')' && stack.peek() == i - 1) { // 레이저 라면,
                stack.pop();
                answer += stack.size();
            } else {
                stack.pop();
                answer += 1;
            }

        }

        System.out.println(answer);

    }
}
