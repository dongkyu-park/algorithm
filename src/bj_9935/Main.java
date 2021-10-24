package bj_9935;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String bomb = sc.next();
        int bombLen = bomb.length();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.add(word.charAt(i));

            if (stack.size() >= bombLen) {
                boolean flag = true;

                for (int j = 0; j < bombLen; j++) {
                    char c1 = stack.get(stack.size() - bombLen + j);
                    char c2 = bomb.charAt(j);

                    if (c1 != c2) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    for (int j = 0; j < bombLen; j++) {
                        stack.pop();
                    }
                }
            }
        }

        if (stack.size() == 0) {
            System.out.println("FRULA");
        } else {
            StringBuilder sb = new StringBuilder();

            for (char c : stack) {
                sb.append(c);
            }
            System.out.println(sb.toString());
        }

    }
}
