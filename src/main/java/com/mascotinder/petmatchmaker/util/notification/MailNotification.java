package com.mascotinder.petmatchmaker.util.notification;

public class MailNotification implements Notifier {


    @Override
    public void send() {
        System.out.println("Envio correo electrónico");
    }
}
