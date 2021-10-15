package bj_1259;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = sc.next();

            if (str.equals("0")) {
                break;
            }

            for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
                if (i == j) {
                    sb.append("yes\n");
                    break;
                }

                if (i + 1 == j) {
                    if (str.charAt(i) == str.charAt(j)) {
                        sb.append("yes\n");
                        break;
                    }
                }

                if (str.charAt(i) != str.charAt(j)) {
                    sb.append("no\n");
                    break;
                }
            }
        }

        System.out.println(sb.toString());

    }
}
