package org.example.clean_code.complex_task.task_1;

import org.example.clean_code.complex_task.task_1.strategy.Base64Strategy;

public class Main {
    public static void main(String[] args) {
        UrlShortenerService shortenerService = new UrlShortenerService(new ShortenerFactory(new Base64Strategy()));

        String shortUrl = shortenerService.shortenUrl("https://example.com/very/long/url1");
        System.out.println("Short URL: " + shortUrl);

        String longUrl = shortenerService.expandUrl(shortUrl);
        System.out.println("Original URL: " + longUrl);

        System.out.println();
        shortenerService.setStrategy("UUID");

        String shortUrl2 = shortenerService.shortenUrl("https://example.com/very/long/url2");
        System.out.println("Short URL: " + shortUrl2);

        String longUrl2 = shortenerService.expandUrl(shortUrl2);
        System.out.println("Original URL: " + longUrl2);

        System.out.println();
        shortenerService.setStrategy("SHA256");

        String shortUrl3 = shortenerService.shortenUrl("https://example.com/very/long/url3");
        System.out.println("Short URL: " + shortUrl3);

        String longUrl3 = shortenerService.expandUrl(shortUrl3);
        System.out.println("Original URL: " + longUrl3);
    }
}
