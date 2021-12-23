package bj_5656;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int line = 1;

        while (true) {
            String[] arr = sc.nextLine().split(" ");
            boolean flag = false;

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);

            if (arr[1].equals("E")) {
                break;
            }

            if (arr[1].equals("!=")) {
                if (a != b) {
                    flag = true;
                }
            }

            if (arr[1].equals("==")) {
                if (a == b) {
                    flag = true;
                }
            }

            if (arr[1].equals("<=")) {
                if (a <= b) {
                    flag = true;
                }
            }

            if (arr[1].equals("<")) {
                if (a < b) {
                    flag = true;
                }
            }

            if (arr[1].equals(">=")) {
                if (a >= b) {
                    flag = true;
                }
            }

            if (arr[1].equals(">")) {
                if (a > b) {
                    flag = true;
                }
            }

            if (flag) {
                sb.append("Case " + line + ": " + "true\n");
            } else {
                sb.append("Case " + line + ": " + "false\n");
            }

            line++;
        }
        System.out.println(sb.toString());
    }
}
