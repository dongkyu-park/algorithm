package pg_12911;

class SolutionOthers {

    public int solution(int n) {
        int answer = 0;
        int temp = countChar(Integer.toBinaryString(n), '1');

        for (int i = n + 1; i < 1000000; i++) {
            if (temp == countChar(Integer.toBinaryString(i), '1')) {
                answer = i;
                break;
            };
        }

        return answer;
    }

    public int countChar(String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

}
