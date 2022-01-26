package pg_42748;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answerArr = new int[commands.length];

        for (int c = 0 ; c < commands.length; c++) {
            int i = commands[c][0] - 1;
            int j = commands[c][1];
            int k = commands[c][2] - 1;

            int[] tempArr = Arrays.copyOfRange(array, i, j);
            tempArr = quickSort(tempArr);
            answerArr[c] = tempArr[k];
        }

        return answerArr;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> arrList = new ArrayList<>();
//
//        arrList.add(5);
//        arrList.add(7);
//        arrList.add(9);
//        arrList.add(10);
//        arrList.add(4);
//        arrList.add(3);
//        arrList.add(1);
//        arrList.add(68);
//        arrList.add(44);
//        arrList.add(33);
//
//        ArrayList<Integer> newList = quickSort(arrList);
//
//        for (int i = 0; i < newList.size(); i++) {
//            System.out.println(newList.get(i));
//        }

        int[] testArr = {5, 60, 58, 44, 1, 3, 4, 14, 18, 15};

        for (int i = 0; i < testArr.length; i++) {
            System.out.println(testArr[i]);
        }

        int[] newArr = quickSort(testArr);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int pivot = arr[0];

        int[] leftArr = getSmallNumber(pivot, arr);
        int[] rightArr = getLargeNumber(pivot, arr);

        int[] sortedLeftArr = quickSort(leftArr);
        int[] sortedRightArr = quickSort(rightArr);

        int sortedArrSize = leftArr.length + 1 + rightArr.length;
        int sortedArrIndex = 0;
        int[] sortedArr = new int[sortedArrSize];

        for (int i = 0; i < sortedLeftArr.length; i++) {
            sortedArr[sortedArrIndex] = (sortedLeftArr[i]);
            sortedArrIndex++;
        }

        sortedArr[sortedArrIndex] = pivot;
        sortedArrIndex++;

        for (int i = 0; i < sortedRightArr.length; i++) {
            sortedArr[sortedArrIndex] = sortedRightArr[i];
            sortedArrIndex++;
        }

        return sortedArr;
    }

    public static int[] getSmallNumber(int pivot, int[] arr) {
        ArrayList<Integer> smallNumberList = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= pivot) {
                smallNumberList.add(arr[i]);
            }
        }

        int[] smallNumberArr = new int[smallNumberList.size()];

        for (int i = 0; i < smallNumberArr.length; i++) {
            smallNumberArr[i] = smallNumberList.get(i);
        }

        return smallNumberArr;
    }

    public static int[] getLargeNumber(int pivot, int[] arr) {
        ArrayList<Integer> largeNumberList = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > pivot) {
                largeNumberList.add(arr[i]);
            }
        }

        int[] largeNumberArr = new int[largeNumberList.size()];

        for (int i = 0; i < largeNumberArr.length; i++) {
            largeNumberArr[i] = largeNumberList.get(i);
        }

        return largeNumberArr;
    }

//    public static ArrayList<Integer> quickSort(ArrayList<Integer> arrList) {
//        if (arrList.size() <= 1) {
//            return arrList;
//        }
//
//        int pivot = arrList.get(0);
//
//        ArrayList<Integer> leftList = getSmallNumberList(pivot, arrList);
//        ArrayList<Integer> rightList = getLargeNumberList(pivot, arrList);
//
//        ArrayList<Integer> sortedLeftList = quickSort(leftList);
//        ArrayList<Integer> sortedRightList = quickSort(rightList);
//
//        ArrayList<Integer> sortedList = new ArrayList<>();
//
//        for (int i = 0; i < sortedLeftList.size(); i++) {
//            sortedList.add(sortedLeftList.get(i));
//        }
//
//        sortedList.add(pivot);
//
//        for (int i = 0; i < sortedRightList.size(); i++) {
//            sortedList.add(sortedRightList.get(i));
//        }
//
//        return sortedList;
//    }
//
//    public static ArrayList<Integer> getSmallNumberList(int pivot, ArrayList<Integer> arrList) {
//        ArrayList<Integer> smallNumberList = new ArrayList<>();
//
//        for (int i = 1; i < arrList.size(); i++) {
//            if (arrList.get(i) <= pivot) {
//                smallNumberList.add(arrList.get(i));
//            }
//        }
//
//        return smallNumberList;
//    }
//
//    public static ArrayList<Integer> getLargeNumberList(int pivot, ArrayList<Integer> arrList) {
//        ArrayList<Integer> largeNumberList = new ArrayList<>();
//
//        for (int i = 0; i < arrList.size(); i++) {
//            if (arrList.get(i) > pivot) {
//                largeNumberList.add(arrList.get(i));
//            }
//        }
//
//        return largeNumberList;
//    }
}