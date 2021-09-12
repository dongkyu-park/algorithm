package bj_10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int sayNumber = sc.nextInt();

            if (sayNumber == 0) {
                stack.pop();
            } else {
                stack.push(sayNumber);
            }
        }

        int sum = 0;

        for(int o : stack) {
            sum += o;
        }

        System.out.println(sum);

    }
}
