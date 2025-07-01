public class NotificationService {
    public void notifyUser(User user, String message, CommunicationChannel channel) {
        System.out.println("Notifying " + user.getEmail() + " via " + channel + ": " + message);
    }
}
