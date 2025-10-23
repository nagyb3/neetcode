package org.example;

public class Main {
    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String sampleInput = "[({})]";
        System.out.println( validParenthesis.isValid(sampleInput));
    }
}