package bj_8595;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String word = sc.next();
        String temp = "";
        long answer = 0;

        for (int i = 0; i < n; i++) {
            if (word.charAt(i) >= '0' &&  word.charAt(i) <= '9') {
                temp += word.charAt(i);
            } else {
                if (temp.equals("")) {
                    continue;
                }
                answer += Integer.parseInt(temp);
                temp = "";
            }
        }

        if (!temp.equals("")) {
            answer += Integer.parseInt(temp);
        }

        System.out.println(answer);
    }
}
