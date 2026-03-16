package org.example.clean_code.complex_task.task_1;

import java.util.HashMap;
import java.util.Map;

public class UrlStorage {
    private Map<String, String> urlBase;

    public UrlStorage(){
        urlBase = new HashMap<>();
    }

    public String getUrl(String key) {
        return urlBase.getOrDefault(key, "No url");
    }

    public String add(String key, String value) {
        return urlBase.put(key, value);
    }
}
