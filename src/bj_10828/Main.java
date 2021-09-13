package bj_10828;

import java.util.Scanner;

public class Main {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        stack = new int[N];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            String order = sc.next();

            if (order.equals("push")) {
                push(sc.nextInt());
            } else if (order.equals("top")) {
                sb.append(top()).append("\n");
            } else if (order.equals("size")) {
                sb.append(size()).append("\n");
            } else if (order.equals("empty")) {
                sb.append(empty()).append("\n");
            } else if (order.equals("pop")) {
                sb.append(pop()).append("\n");
            }
        }

        System.out.println(sb);

    }

    public static void push(int number) {
        stack[size] = number;
        size++;
    }

    public static int pop() {

        if (size == 0) {
            return -1;
        } else {
            int last = stack[size - 1];
            stack[size - 1] = 0;
            size--;

            return last;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }

}