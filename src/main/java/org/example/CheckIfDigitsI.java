package org.example;

// problem: https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/?envType=daily-question&envId=2025-10-23

public class CheckIfDigitsI {
    public boolean hasSameDigits(String s) {
        String first = s;

        while (first.length() > 2) {
            String becomes = "";
            for (int i = 0; i < first.length() - 1; i++) {
                int firstNum = ((int) first.charAt(i) - 48);
                int secondNum = ((int) first.charAt(i + 1) - 48);
                int result = (firstNum + secondNum) % 10;
                becomes += result;
            }
            first = becomes.toString();
        }

        return first.charAt(0) == first.charAt(1);
    }
}
