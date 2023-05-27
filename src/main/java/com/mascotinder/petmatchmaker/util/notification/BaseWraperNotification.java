package com.mascotinder.petmatchmaker.util.notification;

import java.util.ArrayList;
import java.util.List;

public class BaseWraperNotification implements Notifier{

    protected Notifier wrapperNotifier;

    public BaseWraperNotification(Notifier notifier){
        wrapperNotifier = notifier;
    }

    @Override
    public void send() {
        wrapperNotifier.send();
    }
}
