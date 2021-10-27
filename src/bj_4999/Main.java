package bj_4999;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String say = sc.next();
        String doctorReq = sc.next();

        if (say.length() >= doctorReq.length()) {
            System.out.println("go");
        } else if (say.length() < doctorReq.length()) {
            System.out.println("no");
        }
    }
}
