package org.example.clean_code.complex_task.task_1.strategy;

import java.util.UUID;

public class UUIDStrategy implements ShorteningStrategy{

    @Override
    public String encode(String input) {
        if (input == null || input.isEmpty()) {
            return "00000000-0000-0000-0000-000000000000";
        }

        long mostSigBits = input.hashCode() * 2L;
        long leastSigBits = input.length() * 3L;

        for (char c : input.toCharArray()) {
            mostSigBits += c;
            leastSigBits ^= c;
        }

        return new UUID(mostSigBits, leastSigBits).toString();
    }
}
