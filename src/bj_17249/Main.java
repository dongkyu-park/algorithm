package bj_17249;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String picture = sc.next();
        boolean leftFlag = true;
        int left = 0;
        int right = 0;

        for (int i = 0; i < picture.length(); i++) {
            if (picture.charAt(i) == ')') {
                leftFlag = false;
            }

            if (picture.charAt(i) == '@') {
                if (leftFlag) {
                    left++;
                } else {
                    right++;
                }
            }
        }

        System.out.println(left + " " + right);
    }
}
