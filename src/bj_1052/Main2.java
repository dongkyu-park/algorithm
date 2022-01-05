package bj_1052;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr =sc.nextLine().split(" ");

        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        String dec2bin = Integer.toBinaryString(N);

        for (int i = 0; i < dec2bin.length(); i++) {
            if (dec2bin.charAt(i) == '1') {
                stack.add((int) Math.pow(2, dec2bin.length() - 1 - i));
            }
        }

        if (K >= stack.size()) {
            System.out.println("0");
        } else {
            while (stack.size() != K) {
                int a = stack.pop();
                int b = stack.pop();
                answer += b - a;
                stack.add(b * 2);
            }
            System.out.println(answer);
        }

    }
}
