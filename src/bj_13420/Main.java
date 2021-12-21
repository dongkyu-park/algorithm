package bj_13420;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String expression = sc.nextLine();
            String[] arr = expression.split(" ");
            boolean flag = false;

            long firstNum = Long.parseLong(arr[0]);
            long secondNum = Long.parseLong(arr[2]);
            long answer = Long.parseLong(arr[4]);

            if (arr[1].equals("+")) {
                if (firstNum + secondNum == answer) {
                    flag = true;
                }
            } else if (arr[1].equals("-")) {
                if (firstNum - secondNum == answer) {
                    flag = true;
                }
            } else if (arr[1].equals("*")) {
                if (firstNum * secondNum == answer) {
                    flag = true;
                }
            } else if (arr[1].equals("/")) {
                if (firstNum / secondNum == answer) {
                    flag = true;
                }
            }

            if (flag) {
                System.out.println("correct");
            } else {
                System.out.println("wrong answer");
            }

        }
    }
}
