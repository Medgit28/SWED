package com.mehdi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationPreferenceTest {

    @Test
    void testValidFrequency() {
        NotificationPreference pref = new NotificationPreference(30, CommunicationChannel.EMAIL);
        assertEquals(30, pref.getFrequencyInMinutes());
        assertEquals(CommunicationChannel.EMAIL, pref.getChannel());
    }

    @Test
    void testInvalidFrequencyZero() {
        NotificationPreference pref = new NotificationPreference(0, CommunicationChannel.SMS);
        assertEquals(0, pref.getFrequencyInMinutes());  // No validation in original class
        assertEquals(CommunicationChannel.SMS, pref.getChannel());
    }
}
