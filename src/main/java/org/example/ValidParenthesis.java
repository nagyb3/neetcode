package org.example;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<Character>();

        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put(']', '[');
        pairs.put(')', '(');
        pairs.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '[') || (s.charAt(i) == '(') || (s.charAt(i) == '{')) {
                myStack.push(s.charAt(i));
            } else if ((s.charAt(i) == ']') || (s.charAt(i) == ')') || (s.charAt(i) == '}')) {
                if (myStack.isEmpty()) {
                    return false;
                } else {
                    Character lastElement = myStack.pop();
                    if (lastElement != pairs.get(s.charAt(i))) {
                        return false;
                    }
                }
            }
        }

        return myStack.isEmpty();
    }
}
