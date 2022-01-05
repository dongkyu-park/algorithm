package bj_10757;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MainOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        String a = arr[0];
        String b = arr[1];

        Deque<Integer> aDeque = new ArrayDeque<>();
        Deque<Integer> bDeque = new ArrayDeque<>();

        addDataDeque(aDeque, a);
        addDataDeque(bDeque, b);
        matchDequeSize(aDeque, bDeque);

        int dataLen = aDeque.size();
        int[] answerArr = new int[dataLen];

        SumCarry sumCarry = new SumCarry();

        while (!aDeque.isEmpty()) {
            sumCarry = decCalculate(aDeque.pollLast(), bDeque.pollLast(), sumCarry.isCarry());
            answerArr[dataLen - 1] = sumCarry.getSum();
            dataLen--;
        }

        StringBuilder sb = new StringBuilder();

        if (sumCarry.isCarry()) {
            sb.append(1);
        }

        for (int i = 0; i < answerArr.length; i++) {
            sb.append(answerArr[i]);
        }

        System.out.println(sb.toString());

    }

    private static void addDataDeque(Deque<Integer> deque, String data) {
        for (int i = 0; i < data.length(); i++) {
            deque.addLast(Character.getNumericValue(data.charAt(i)));
        }
    }

    private static void matchDequeSize(Deque<Integer> aDeque, Deque<Integer> bDeque) {
        while (aDeque.size() < bDeque.size()) {
            aDeque.addFirst(0);
        }

        while (aDeque.size() > bDeque.size()) {
            bDeque.addFirst(0);
        }
    }

    public static SumCarry decCalculate(int aDec, int bDec, boolean carry) {
        int addCarry = 0;

        if (carry) {
            addCarry = 1;
        }

        if (aDec + bDec + addCarry >= 10) {
            SumCarry sumCarry = new SumCarry((aDec + bDec + addCarry) % 10, true);
            return sumCarry;
        }

        SumCarry sumCarry = new SumCarry((aDec + bDec + addCarry) % 10, false);
        return sumCarry;
    }
}

class SumCarry {
    int sum = 0;
    boolean carry = false;

    public SumCarry() {
    }

    public SumCarry(int sum, boolean carry) {
        this.sum = sum;
        this.carry = carry;
    }

    public int getSum() {
        return sum;
    }

    public boolean isCarry() {
        return carry;
    }
}

