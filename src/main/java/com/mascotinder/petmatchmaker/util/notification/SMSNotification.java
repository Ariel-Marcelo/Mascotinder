package com.mascotinder.petmatchmaker.util.notification;

public class SMSNotification extends BaseWraperNotification{

    public SMSNotification(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        wrapperNotifier.send();
        System.out.println("SMS notification");
    }
}
