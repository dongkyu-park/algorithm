package bj_11655;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            // 대문자 처리
            if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
                if (S.charAt(i) + 13 > 'Z') {
                    sb.append((char) ('A' + (S.charAt(i) + 13 - 'Z') - 1));
                } else {
                    sb.append((char) (S.charAt(i) + 13));
                }
                continue;
            }

            // 소문자 처리
            if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
                if (S.charAt(i) + 13 > 'z') {
                    sb.append((char) ('a' + (S.charAt(i) + 13 - 'z') - 1));
                } else {
                    sb.append((char) (S.charAt(i) + 13));
                }
                continue;
            }

            sb.append(S.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
