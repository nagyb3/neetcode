package org.example;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> nums2Set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2Set.add(nums2[i]);
        }

        Set<Integer> result = new HashSet<>(nums1Set);
        result.retainAll(nums2Set);
        return result.stream().mapToInt(Number::intValue).toArray();
    }
}
