package bj_2857;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
//        boolean isHere = false;

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            Stack<Character> FBI_stack = new Stack<>();

            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == 'F') {
                    FBI_stack.add(name.charAt(j));
                    continue;
                }

                if (name.charAt(j) == 'B') {
                    if (FBI_stack.size() == 1) {
                        FBI_stack.add(name.charAt(j));
                        continue;
                    }
                }

                if (name.charAt(j) == 'I') {
                    if (FBI_stack.size() == 2) {
                        FBI_stack.add(name.charAt(j));
//                        isHere = true;
                        break;
                    }
                }

                while (!FBI_stack.isEmpty()) {
                    FBI_stack.pop();
                }
            }

            if (!FBI_stack.isEmpty()) {
                sb.append((i + 1) + " ");
            }
        }

        if (sb.length() == 0) {
            sb.append("HE GOT AWAY!");
        }

        System.out.println(sb.toString());

    }
}
