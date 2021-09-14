package bj_9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();

            String word = sc.next();
            boolean flag = false;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == '(') {
                    stack.push(word.charAt(j));
                } else {
                    if (stack.isEmpty()) {
                        sb.append("NO").append("\n");
                        flag = true;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (flag) {
                continue;
            }

            if (stack.isEmpty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }

        }

        System.out.println(sb);

    }
}
