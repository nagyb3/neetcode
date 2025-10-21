package org.example;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int difference = target - nums[i];

            if (seen.containsKey(difference)) {
                return new int[] {
                   seen.get(difference), i
                };
            }
            seen.put(nums[i], i);
        }
        return new int[] {0, 0};
    }
}
