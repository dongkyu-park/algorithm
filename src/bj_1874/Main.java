package bj_1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int number = 1;

        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();

            // 다음 stack에 넣을 값인 number보다 입력받은 temp 값이 크다면, push반복
            while (temp >= number) {
                stack.push(number);
                sb.append("+").append("\n");
                number++;
            }

            // stack이 비어있지 않다면,
            if (!stack.isEmpty()) {
                if (stack.peek() >= temp) {
                    while (true) {
                        sb.append("-").append("\n");

                        if (stack.pop() == temp) {
                            break;
                        }
                    }
                } else {
                    System.out.println("NO");
                    return;
                }
            } else { // stack이 비어 있다면, 위의 while문을 통과하지 않은 것이고, stack에서도 입력된 temp값을 반환할 방법이 없으므로 NO 리턴.
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);

    }
}
