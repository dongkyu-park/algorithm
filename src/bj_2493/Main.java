package bj_2493;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        Stack<int[]> stack = new Stack<>();
        String[] numArr = sc.nextLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numArr.length; i++) {

            while (!stack.isEmpty()) {
                if (stack.peek()[0] >= Integer.parseInt(numArr[i])) {
                    sb.append(stack.peek()[1] + " ");
                    break;
                } else { // 들어오는 값보다 더 작은 값이라면, stack에 저장되어 있을 필요가 없다.
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                sb.append("0 ");
            }

            stack.push(new int[] {Integer.parseInt(numArr[i]), i + 1});

        }

        System.out.println(sb);

    }
}
