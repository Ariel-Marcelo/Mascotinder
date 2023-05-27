package com.mascotinder.petmatchmaker.util.notification;

public class FacebookNotification extends BaseWraperNotification{

    public FacebookNotification(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        wrapperNotifier.send();
        System.out.println("Send Facebook Notification");
    }
}
