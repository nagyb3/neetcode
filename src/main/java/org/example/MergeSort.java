package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return nums;

        if (nums.length == 2) {
            if (nums[0] <= nums[1]) {
                return nums;
            } else {
                int[] returning = new int[]{
                        nums[1], nums[0]
                };
                return returning;
            }
        }

        int middleIndex = (nums.length / 2) - 1;

        int[] firstHalf = sortArray(Arrays.copyOfRange(nums, 0, middleIndex + 1));
        int[] secondHalf = sortArray(Arrays.copyOfRange(nums, middleIndex + 1, nums.length));

        int[] result = new int[firstHalf.length + secondHalf.length];
        int firstIndex = 0;
        int secondIndex = 0;
        int counter = 0;

        while (firstIndex <= firstHalf.length - 1 || secondIndex <= secondHalf.length - 1) {
            if (firstIndex <= firstHalf.length - 1 && secondIndex <= secondHalf.length - 1) {
                if (firstHalf[firstIndex] <= secondHalf[secondIndex]) {
                    result[counter] = firstHalf[firstIndex];
                    firstIndex++;
                } else {
                    result[counter] = secondHalf[secondIndex];
                    secondIndex++;
                }
            } else if (firstIndex <= firstHalf.length - 1 && (secondIndex >= secondHalf.length - 1)) {
                result[counter] = firstHalf[firstIndex];
                firstIndex++;
            } else {
                result[counter] = secondHalf[secondIndex];
                secondIndex++;
            }
            counter++;
        }
        return result;
    }
}
