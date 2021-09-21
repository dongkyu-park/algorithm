package bj_5397;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        for (int i = 0; i < L; i++) {

            Stack<Character> leftStack = new Stack<>();
            Stack<Character> rightStack = new Stack<>();

            StringBuilder sb = new StringBuilder();
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '<') {
                   if (!leftStack.isEmpty()) {
                       rightStack.push(leftStack.pop());
                   }
                } else if (str.charAt(j) == '>') {
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                } else if (str.charAt(j) == '-') {
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                } else {
                    leftStack.push(str.charAt(j));
                }
            }

            for (Character word : leftStack) {
                sb.append(word);
            }

            while (!rightStack.isEmpty()) {
                sb.append(rightStack.pop());
            }

            System.out.println(sb);

        }
    }
}
