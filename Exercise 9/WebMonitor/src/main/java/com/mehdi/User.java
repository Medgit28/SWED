package com.mehdi;
import java.util.ArrayList;
import java.util.List;

public class User implements Observer {
    private String name;
    private String email;
    private List<Subscription> subscriptions = new ArrayList<>();

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addSubscription(Subscription sub) {
        subscriptions.add(sub);
    }

    public void removeSubscription(Subscription sub) {
        subscriptions.remove(sub);
    }

    public void updateSubscription(Subscription oldSub, Subscription newSub) {
        int index = subscriptions.indexOf(oldSub);
        if (index != -1) {
            subscriptions.set(index, newSub);
        }
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void update(String url) {
        System.out.println("User " + name + " notified about update on: " + url);
    }
}
