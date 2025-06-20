package behavioral.observer.example2;

public record MobileAppListener(String username) implements Listener {

    @Override
    public void update(Event eventType) {
        // Actually send the push notification to username
        System.out.println("Sending mobile app notification to " + username + " concerning " + eventType);
    }

}
