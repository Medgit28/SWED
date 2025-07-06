package com.mehdi;
public class NotificationPreference {
    private int frequencyInMinutes;
    private CommunicationChannel channel;

    public NotificationPreference(int frequencyInMinutes, CommunicationChannel channel) {
        this.frequencyInMinutes = frequencyInMinutes;
        this.channel = channel;
    }

    public int getFrequencyInMinutes() {
        return frequencyInMinutes;
    }

    public CommunicationChannel getChannel() {
        return channel;
    }
}
