package bj_9093;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            Stack stack = new Stack<>();
            String s = sc.nextLine();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    while (!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                } else {
                    stack.add(s.charAt(j));
                }
            }

            while (!stack.empty()) {
                sb.append(stack.pop());
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }
}
