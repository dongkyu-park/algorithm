package bj_1357;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] word = sc.nextLine().split(" ");

        String X = word[0];
        String Y = word[1];

        String XY = String.valueOf(Rev(X) + Rev(Y));

        System.out.println(Rev(XY));
    }

    public static int Rev(String num) {
        String str = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            str += num.charAt(i);
        }

        return Integer.parseInt(str);
    }
}
