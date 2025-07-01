public class SubscriptionManager {
    private NotificationService notifier = new NotificationService();

    public void checkAndNotify(User user) {
        for (Subscription sub : user.getSubscriptions()) {
            sub.attach(user); 
            if (sub.checkForUpdate()) {
                notifier.notifyUser(
                    user,
                    "Website updated: " + sub.getUrl(),
                    sub.getPreference().getChannel()
                );
            }
        }
    }
}
