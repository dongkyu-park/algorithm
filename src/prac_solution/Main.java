package prac_solution;

public class Main {

    /* 자연수가 들어있는 배열 arr가 매개변수로 주어진다. 배열 arr 안의 숫자들 중에서 앞에 있는 숫자들부터
    * 뒤에 중복되어 나타나는 숫자들 중복 횟수를 계산해서 배열로 return 하도록 solution 함수를 완성하자.
    * 만약 중복되는 숫자가 없다면 배열에 -1을 채워서 return 한다. */

    /* 입출력 예1)
    * arr = [1, 2, 3, 3, 3, 3, 4, 4]에서 3은 4번, 4는 2번씩 나타나므로 [4, 2]를 반환
    *
    * 입출력 예2)
    * arr = [3, 2, 4, 4, 2, 5, 2, 5, 5]이면 2가 3회, 4가 2회, 5가 3회 나타나므로 [3, 2, 3]를 반환
    *
    * 입출력 예3)
    * [3, 5, 7, 9, 1]에서 중복해서 나타나는 숫자는 없으므로 [-1]를 반환 */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 4};
//        int[] arr = {3, 2, 4, 4, 2, 5, 2, 5, 5};
//        int[] arr = {3, 5, 7, 9, 1};
        int count = 0;

        int[] temp = new int[100];

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 1) {
                count++;
            }
        }

        if (count == 0) {
            int[] result = new int[1];
            result[0] = -1;

            for (int a : result) {
                System.out.println(a);
            }
        } else {
            int[] result = new int[count];
            count = 0;

            for (int i = 0; i < temp.length; i++) {
                if (temp[i] > 1) {
                    result[count] = temp[i];
                    count++;
                }
            }

            for (int a : result) {
                System.out.println(a);
            }
        }

    }
}
