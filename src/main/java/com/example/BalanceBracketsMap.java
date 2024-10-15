package com.example;

import java.util.HashMap;

public class BalanceBracketsMap {
    private static final HashMap<Character, Character> MAP;

    static {
        MAP = new HashMap<>();

        MAP.put('{', '}');
        MAP.put('(', ')');
        MAP.put('[', ']');
    }

    public static Character get(Character key) {
        return BalanceBracketsMap.MAP.get(key);
    }
}
