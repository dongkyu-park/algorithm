package bj_1764;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> answerList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            hashSet.add(sc.next());
        }

        for (int i = 0; i < M; i++) {

            String input = sc.next();

            if (hashSet.contains(input)) {
                answerList.add(input);
            }
        }

        Collections.sort(answerList);
        System.out.println(answerList.size());

        for (String print : answerList) {
            System.out.println(print);
        }

    }
}
