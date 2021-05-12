package bj_11654;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int asc = str.charAt(0); // String.charAt(index) - index위치의 문자를 Char형 반환, Char -> int 형변환하면 ASCII 코드 값이 된다.

        System.out.println(asc);
    }
}
