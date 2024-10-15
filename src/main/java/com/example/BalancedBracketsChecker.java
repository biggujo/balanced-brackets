package com.example;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;

@Value
@AllArgsConstructor
public class BalancedBracketsChecker {
    @NonNull
    String string;

    public boolean isBalanced() {
        if (!doesStringHaveEvenAmountOfCharacters()) {
            return false;
        }

        int length = string.length();

        for (int i = 0; i < length / 2; i++) {
            Character key = string.charAt(i);
            Character guessedPair = string.charAt(length - i - 1);

            Character realPair = BalanceBracketsMap.get(key);

            if (realPair == null) {
                return false;
            }

            if (realPair != guessedPair) {
                return false;
            }
        }

        return true;
    }

    private boolean doesStringHaveEvenAmountOfCharacters() {
        return string.length() % 2 == 0;
    }
}
