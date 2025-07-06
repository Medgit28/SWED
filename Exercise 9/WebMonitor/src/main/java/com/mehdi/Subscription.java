package com.mehdi;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Subscription implements Subject {
    private String url;
    private NotificationPreference preference;
    private LocalDateTime lastChecked;
    private List<Observer> observers = new ArrayList<>();
    private WebsiteComparison strategy;

    public Subscription(String url, NotificationPreference preference, WebsiteComparison strategy) {
        this.url = url;
        this.preference = preference;
        this.strategy = strategy;
        this.lastChecked = LocalDateTime.now();
    }

    public boolean checkForUpdate() {
        boolean updated = strategy.hasUpdated(url, lastChecked);
        if (updated) {
            lastChecked = LocalDateTime.now();
            notifyObservers(url);
        }
        return updated;
    }

    public String getUrl() {
        return url;
    }

    public NotificationPreference getPreference() {
        return preference;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String url) {
        for (Observer o : observers) {
            o.update(url);
        }
    }
}
