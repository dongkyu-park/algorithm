package knapsack;

import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double n = sc.nextDouble();
        Double m = sc.nextDouble();

        Map<Double, Double> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(sc.nextDouble(), sc.nextDouble());
        }

        // Map.Entry 리스트 작성
        List<Entry<Double, Double>> list_entries = new ArrayList<Entry<Double, Double>>(map.entrySet());

        // 비교함수 Comparator를 사용하여 내림 차순으로 정렬
        Collections.sort(list_entries, new Comparator<Entry<Double, Double>>() {
            // compare로 값을 비교
            public int compare(Entry<Double, Double> obj1, Entry<Double, Double> obj2) {
                // 내림 차순으로 정렬
                Double o1 = obj1.getValue() / obj1.getKey();
                Double o2 = obj2.getValue() / obj2.getKey();

                return o2.compareTo(o1);
            }
        });

        double answer = 0;
        int curWeight = 0;
        double mWeight = 0.0;
        double mValue = 0.0;

        for (int i = 0; i < list_entries.size(); i++) {
            mWeight = list_entries.get(i).getKey();
            mValue = list_entries.get(i).getValue();

            if (curWeight + mWeight < m) {
                curWeight += mWeight;
                answer += mValue;
            } else if (curWeight + mWeight == m) {
                curWeight += mWeight;
                answer += mValue;

                break;
            } else {
                double temp = m - curWeight;
                answer += temp * (mValue / mWeight);

                break;
            }

        }

        System.out.println(answer);

    }
}