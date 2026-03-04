package org.example.clean_code.complex_task.task_1;

import java.util.HashMap;
import java.util.Map;

public class UrlStorage {
    private Map<String, String> urlBase;

    public UrlStorage(){
        urlBase = new HashMap<>();
    }

    public Map<String, String> getUrlBase() {
        return urlBase;
    }

    public String add(String key, String value) {
        return urlBase.put(key, value);
    }
}
