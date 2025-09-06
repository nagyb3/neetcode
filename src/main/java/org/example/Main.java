package org.example;

public class Main {
    public static void main(String[] args) {

        String s = "racecar";
        String t = "carrace";

        ValidAnagram validAnagram = new ValidAnagram();

        System.out.println(validAnagram.isAnagram(s, t));
    }
}