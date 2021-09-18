package bj_1406;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            leftStack.push(str.charAt(i));
        }

        int orderCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < orderCount; i++) {
            String order = br.readLine();

            if (order.startsWith("P")) {
                leftStack.push(order.charAt(order.length() - 1));
            } else if (order.startsWith("L")) {
                if (leftStack.isEmpty()) {
                    continue;
                } else {
                    rightStack.push(leftStack.pop());
                }
            } else if (order.startsWith("D")) {
                if (rightStack.isEmpty()) {
                    continue;
                } else {
                    leftStack.push(rightStack.pop());
                }
            } else if (order.startsWith("B")) {
                if (leftStack.isEmpty()) {
                    continue;
                } else {
                    leftStack.pop();
                }
            }
        }

        for (char i : leftStack) {
            sb.append(i);
        }

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb);

    }
}
