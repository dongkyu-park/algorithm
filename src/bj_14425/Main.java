package bj_14425;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
//        String[] arr = new String[N];
        Set<String> arrList = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            arrList.add(sc.next());
        }

        for (int i = 0; i < M; i++) {
            if (arrList.contains(sc.next())) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
