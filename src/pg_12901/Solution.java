package pg_12901;

class Solution {
    public String solution(int a, int b) {
        String answer = "";

        int temp = 0;

        switch (a) {
            case 1: temp = b % 7;
                    break;
            case 2: temp = (b + 31) % 7;
                    break;
            case 3: temp = (b + 31 + 29) % 7;
                    break;
            case 4: temp = (b + 31 + 29 + 31) % 7;
                    break;
            case 5: temp = (b + 31 + 29 + 31 + 30) % 7;
                    break;
            case 6: temp = (b + 31 + 29 + 31 + 30 + 31) % 7;
                    break;
            case 7: temp = (b + 31 + 29 + 31 + 30 + 31 + 30) % 7;
                    break;
            case 8: temp = (b + 31 + 29 + 31 + 30 + 31 + 30 + 31) % 7;
                    break;
            case 9: temp = (b + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31) % 7;
                    break;
            case 10: temp = (b + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30) % 7;
                    break;
            case 11: temp = (b + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) % 7;
                    break;
            case 12: temp = (b + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) % 7;
                    break;
        }

        switch (temp) {
            case 0: answer = "THU";
                    break;
            case 1: answer = "FRI";
                    break;
            case 2: answer = "SAT";
                    break;
            case 3: answer = "SUN";
                    break;
            case 4: answer = "MON";
                    break;
            case 5: answer = "TUE";
                    break;
            case 6: answer = "WED";
                    break;
        }

        return answer;
    }
}