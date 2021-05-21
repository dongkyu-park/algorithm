package bj_1316;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            boolean[] arr = new boolean[26];

            for (int j = 0; j < temp.length(); j++) {
                // 값을 읽어왔을 때 값이 true라면 for문 종료
                if (arr[temp.charAt(j) - 'a']) {
                    break;
                }
                // 반복문이 마지막이라면, count +1후 for문 종료
                if (j == temp.length() - 1) {
                    count++;
                    break;
                }
                // 다음값과 현재값이 일치한다면, true 설정없이 for문 반복
                if (temp.charAt(j) == temp.charAt(j + 1)) {
                    continue;
                }
                // 다음값이 현재값과 다르다면, 현재값의 알파벳을 true로 설정 후 for문 반복
                arr[temp.charAt(j) - 'a'] = true;
            }
        }

        System.out.println(count);
    }
}
