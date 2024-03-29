package Algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] num = new int[]{2, 1, 3, 1, 3, 45, 2, 3, 1, 23, 13, 1};

        System.out.println(Arrays.toString(sort(num)));

    }

    private static int[] sort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return inputArray;
        }

        int midIndex = inputLength / 2;

        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightArray[i - midIndex] = inputArray[i];
        }

        sort(leftArray);
        sort(rightArray);

        return merge(inputArray, leftArray, rightArray);
    }

    public static int[] merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
        return inputArray;
    }
}
