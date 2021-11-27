package bj_12904;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();
        int T_len = T.length();
        String answer = "";

        for (int i = T_len - 1; i >= 0; i--) {
            if (S.length() == T.length()) {
                if (S.equals(T)) {
                    answer = "1";
                    break;
                } else {
                    answer = "0";
                    break;
                }
            } else {
                if (T.charAt(i) == 'A') {
                    T = T.substring(0, T.length() - 1);
                    continue;
                }

                if (T.charAt(i) == 'B') {
                    String temp = T.substring(0, T.length() - 1);
                    StringBuffer sb = new StringBuffer(temp);
                    T = sb.reverse().toString();
                    continue;
                }
            }
        }

        System.out.println(answer);
    }
}
