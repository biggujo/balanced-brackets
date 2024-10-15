package com.example;

public class Main {
    public static void main(String[] args) {
        // true
        System.out.println(new BalancedBracketsChecker("[{()}]").isBalanced());

        // true
        System.out.println(new BalancedBracketsChecker("{([])}").isBalanced());

        // false
        System.out.println(new BalancedBracketsChecker("]$[wer").isBalanced());
    }
}
