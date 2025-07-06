package com.mehdi;
import java.time.LocalDateTime;

public class HtmlComparison implements WebsiteComparison {
    @Override
    public boolean hasUpdated(String url, LocalDateTime lastChecked) {
        // Simulate update check by HTML content
        return Math.random() > 0.5;
    }
}