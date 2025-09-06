package org.example;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            for (int j = 0; j < tArray.length; j++) {
                if (sArray[i] != tArray[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
