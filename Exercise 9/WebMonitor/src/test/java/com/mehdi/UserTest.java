package com.mehdi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testAddAndRemoveSubscription() {
        User user = new User("Mehdi", "mehdi@example.com");
        NotificationPreference pref = new NotificationPreference(30, CommunicationChannel.PUSH_NOTIFICATION);
        Subscription sub = new Subscription("http://example.com", pref, new HtmlComparison());

        user.addSubscription(sub);
        assertTrue(user.getSubscriptions().contains(sub));

        user.removeSubscription(sub);
        assertFalse(user.getSubscriptions().contains(sub));
    }

    @Test
    void testUpdateSubscription() {
        User user = new User("Mehdi", "mehdi@example.com");
        NotificationPreference pref = new NotificationPreference(30, CommunicationChannel.EMAIL);
        Subscription oldSub = new Subscription("http://old.com", pref, new TextComparison());
        Subscription newSub = new Subscription("http://new.com", pref, new TextComparison());

        user.addSubscription(oldSub);
        user.updateSubscription(oldSub, newSub);

        assertFalse(user.getSubscriptions().contains(oldSub));
        assertTrue(user.getSubscriptions().contains(newSub));
    }
}
