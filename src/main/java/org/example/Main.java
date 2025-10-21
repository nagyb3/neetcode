package org.example;

public class Main {
    public static void main(String[] args) {
        String[] sampleInput = {"bdddddddddd","bbbbbbbbbbc"};

        GroupAnagrams groupAnagrams = new GroupAnagrams();

        System.out.println(groupAnagrams.groupAnagrams(sampleInput));
    }
}