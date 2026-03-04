package org.example.clean_code.complex_task.task_1.strategy;

import java.util.Base64;

public class Base62Strategy implements ShorteningStrategy{
    @Override
    public String encode(String input) {
        return Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(input.getBytes());
    }
}
