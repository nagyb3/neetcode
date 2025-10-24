package org.example;

// problem: https://leetcode.com/problems/next-greater-numerically-balanced-number/description

import java.util.HashMap;

public class NextGreaterNumericallyBalancedNumber {
    public int nextBeautifulNumber(int n) {
        int num = n + 1;
        while (true) {
            HashMap<Integer, Integer> myHashMap = new HashMap<>();
            for (int i = 0; i < String.valueOf(num).length(); i++) {
                int key = ((int) String.valueOf(num).charAt(i)) - 48;
                myHashMap.merge(key, 1, Integer::sum);
            }

            boolean notright = false;
            for (Integer key: myHashMap.keySet()) {
                if (key != myHashMap.get(key)) {
                    notright = true;
                }
            }

            if (!notright) return num;

            num++;
        }
    }
}
