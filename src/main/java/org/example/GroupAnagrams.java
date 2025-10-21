package org.example;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> seenHashMap = new HashMap<>();

        int biggestNumberOfDigits = 0;

        for (int i = 0; i < strs.length; i++) {
            int[] counterKey = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                int val = ((int) strs[i].toLowerCase().charAt(j)) - 96 - 1;


                int newValue = counterKey[val] + 1;

                if (Integer.toString(newValue).length() > biggestNumberOfDigits) {
                    biggestNumberOfDigits = Integer.toString(newValue).length();
                }

                counterKey[val] = newValue;
            }

            StringBuilder myKey = new StringBuilder();
            for (int j = 0; j < counterKey.length; j++) {

                int howMuchPadding = biggestNumberOfDigits - String.valueOf(counterKey[j]).length();

                String padding = "";
                for (int pad = 0; pad < howMuchPadding; pad++) {
                    padding += "0";
                }

                String x = String.valueOf(counterKey[j]);
                myKey.append(padding + x);
            }

            if (seenHashMap.containsKey(myKey.toString())) {
                List<String> prevElement = seenHashMap.get(myKey.toString());
                prevElement.add(strs[i]);
                seenHashMap.put(myKey.toString(), prevElement);
            } else {
                List<String> newElement = new ArrayList<>();
                newElement.add(strs[i]);
                seenHashMap.put(myKey.toString(), newElement);
            }
        }

        List<List<String>> result = new ArrayList<>();

        for (String key: seenHashMap.keySet()) {
            result.add(seenHashMap.get(key));
        }
        return result;
    }
}
