package bj_2935;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String operator = sc.next();
        String B = sc.next();

        StringBuilder sb = new StringBuilder();

        if (operator.equals("*")) {
            sb.append(A);

            for (int i = 1; i < B.length(); i++) {
                sb.append("0");
            }

        } else {
            if (A.length() == B.length()) {
                sb.append(A);
                sb.setCharAt(0, '2');
            } else if (A.length() > B.length()) {
                sb.append(A);
                sb.setCharAt(A.length() - B.length(), '1');
            } else {
                sb.append(B);
                sb.setCharAt(B.length() - A.length(), '1');
            }
        }

        System.out.println(sb.toString());

    }
}
