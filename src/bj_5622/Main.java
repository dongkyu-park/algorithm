package bj_5622;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,3,3
                    ,4,4,4
                    ,5,5,5
                    ,6,6,6
                    ,7,7,7
                    ,8,8,8,8
                    ,9,9,9
                    ,10,10,10,10};

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum += arr[a.charAt(i) - 'A'];
        }

        System.out.println(sum);

    }
}
