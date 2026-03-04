package org.example.clean_code.complex_task.task_1;

import org.example.clean_code.complex_task.task_1.strategy.ShorteningStrategy;

public class UrlShortenerService {

    private ShorteningStrategy strategy;
    private Factory urlFactory;
    private UrlStorage urlStorage;

    public UrlShortenerService(Factory shortenerFactory) {
        this.urlFactory = shortenerFactory;
        this.strategy = shortenerFactory.getStrategy();
        urlStorage = new UrlStorage();
    }

    public void setStrategy(String strategy) {
        this.strategy = urlFactory.setStrategy(strategy);
    }

    public String shortenUrl(String url) {
        String value = strategy.encode(url);
        urlStorage.add(value, url);
        return value;
    }

    public String expandUrl(String url) {
        return urlStorage.getUrlBase().getOrDefault(url, "No url");
    }
}
