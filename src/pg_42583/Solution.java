package pg_42583;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int curWeight = 0;
        int time = 0;
        int tIdx = 0;

        Queue<Truck> q = new LinkedList<>();

        while (tIdx != truck_weights.length){
            if (!q.isEmpty() && q.peek().endTime == time){
                curWeight -= q.peek().truckWeight;
                q.poll();
            }

            if (truck_weights[tIdx] + curWeight <= weight){
                q.add(new Truck(truck_weights[tIdx], time + bridge_length));
                curWeight += truck_weights[tIdx];
                tIdx++;
            }

            time++;
        }

        return time + bridge_length;
    }

    class Truck {
        int truckWeight;
        int endTime;

        public Truck (int truckWeight, int time) {
            this.truckWeight = truckWeight;
            this.endTime = time;
        }
    }

}