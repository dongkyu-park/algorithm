package bj_1076;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long answer = 0;

        Map<String, ColorInfo> map = new HashMap<>();
        map.put("black", new ColorInfo(0, 1));
        map.put("brown", new ColorInfo(1, 10));
        map.put("red", new ColorInfo(2, 100));
        map.put("orange", new ColorInfo(3, 1000));
        map.put("yellow", new ColorInfo(4, 10000));
        map.put("green", new ColorInfo(5, 100000));
        map.put("blue", new ColorInfo(6, 1000000));
        map.put("violet", new ColorInfo(7, 10000000));
        map.put("grey", new ColorInfo(8, 100000000));
        map.put("white", new ColorInfo(9, 1000000000));

        answer += map.get(sc.next()).getValue() * 10;
        answer += map.get(sc.next()).getValue();
        answer *= map.get(sc.next()).getMultipleValue();

        System.out.println(answer);
    }
}

class ColorInfo {
    int value;
    int multipleValue;

    public ColorInfo(int value, int multipleValue) {
        this.value = value;
        this.multipleValue = multipleValue;
    }

    public int getValue() {
        return value;
    }

    public int getMultipleValue() {
        return multipleValue;
    }
}
