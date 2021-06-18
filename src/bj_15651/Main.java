package bj_15651;

import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static int n;
    public static int m;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];

        dfs(0);
        System.out.print(sb);

    }

    public static void dfs(int depth) {
        // 깊이가 m과 같아진다면 출력 후 리턴
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            dfs(depth + 1);
        }
    }
}
