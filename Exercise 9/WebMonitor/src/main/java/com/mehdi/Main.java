package com.mehdi;
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main <website-url>");
            return;
        }

        String websiteUrl = args[0];

        User user = new User("Mehdi", "Mehdi@example.com");
        NotificationPreference pref = new NotificationPreference(60, CommunicationChannel.EMAIL);
        WebsiteComparison strategy = new TextComparison();

        Subscription sub = new Subscription(websiteUrl, pref, strategy);
        user.addSubscription(sub);

        SubscriptionManager manager = new SubscriptionManager();
        manager.checkAndNotify(user);
    }
}
