package com.mehdi;

import org.junit.jupiter.api.Test;

class NotificationServiceTest {

    @Test
    void testNotifyUser() {
        NotificationService service = new NotificationService();
        User user = new User("Mehdi", "mehdi@example.com");

        // This just prints output, so we don't assert here
        service.notifyUser(user, "Test message", CommunicationChannel.EMAIL);
    }
}
