package bj_3052;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        HashSet<Integer> hashSet= new HashSet<>();

        for (int temp : arr) {
            hashSet.add(temp % 42);
        }

        System.out.println(hashSet.size());
    }
}
