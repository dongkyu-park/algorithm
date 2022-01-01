package bj_8949;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        int firstNum = Integer.parseInt(arr[0]);
        int secondNum = Integer.parseInt(arr[1]);
        ArrayList<String> arrList = new ArrayList<>();

        while (firstNum > 0 || secondNum > 0) {
            arrList.add(String.valueOf(firstNum % 10 + secondNum % 10));

            firstNum = firstNum / 10;
            secondNum = secondNum / 10;
        }

        for (int i = arrList.size() - 1; i >= 0; i--) {
            System.out.print(arrList.get(i));
        }
    }
}
