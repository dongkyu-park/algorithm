package bj_2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String firstNew = "";
        String second = sc.next();
        String secondNew = "";

        for (int i = first.length() - 1; i >= 0; i--) {
            firstNew += String.valueOf(first.charAt(i));
        }

        for (int i = second.length() - 1; i >= 0; i--) {
            secondNew += String.valueOf(second.charAt(i));
        }

        int a = Integer.parseInt(firstNew);
        int b = Integer.parseInt(secondNew);

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
