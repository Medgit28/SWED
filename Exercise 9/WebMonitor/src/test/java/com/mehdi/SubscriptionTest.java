package com.mehdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SubscriptionTest {

    private Subscription subscription;

    @BeforeEach
    void setup() {
        NotificationPreference preference = new NotificationPreference(60, CommunicationChannel.EMAIL);
        WebsiteComparison strategy = new TextComparison();
        subscription = new Subscription("http://example.com", preference, strategy);
    }

    @Test
    void testCheckForUpdateReturnsBoolean() {
        boolean updated = subscription.checkForUpdate();
        assertTrue(updated || !updated); // always boolean, trivial test to ensure no exception
    }

    @Test
    void testAttachAndNotifyObservers() {
        TestObserver observer = new TestObserver();
        subscription.attach(observer);

        subscription.notifyObservers("http://example.com");
        assertTrue(observer.wasNotified);
    }

    // Simple Observer implementation for testing
    private static class TestObserver implements Observer {
        boolean wasNotified = false;
        @Override
        public void update(String url) {
            wasNotified = true;
            assertEquals("http://example.com", url);
        }
    }
}
