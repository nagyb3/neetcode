package org.example;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }

        return false;
    }
}
