package bj_4358;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<String, Double> map = new TreeMap<>();
        double total = 0.0;

        while (sc.hasNextLine()) {
            String tree = sc.nextLine();

            if (map.containsKey(tree)) {
                map.put(tree, map.get(tree) + 1);
            } else {
                map.put(tree, 1.0);
            }

            total++;
        }

        for (String treeName : map.keySet()) {
            System.out.println(treeName + " " + String.format("%.4f", (map.get(treeName) / total) * 100));
        }

    }
}
