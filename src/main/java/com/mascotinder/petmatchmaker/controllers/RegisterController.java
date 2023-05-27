package com.mascotinder.petmatchmaker.controllers;

import com.mascotinder.petmatchmaker.util.forms.LoginForm;
import com.mascotinder.petmatchmaker.util.forms.RegisterForm;
import com.mascotinder.petmatchmaker.util.notification.FacebookNotification;
import com.mascotinder.petmatchmaker.util.notification.MailNotification;
import com.mascotinder.petmatchmaker.util.notification.Notifier;
import com.mascotinder.petmatchmaker.util.notification.SMSNotification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class RegisterController {

    @GetMapping("/registro")
    public String getFormRegister(){

        return "register";
    }

    @PostMapping("/registro")
    public String setRegister(@ModelAttribute("registerForm") RegisterForm registerForm) {
        String name = registerForm.getUserName();
        String password = registerForm.getPassword();
        Boolean facebook = registerForm.getFacebookNotification();
        Boolean sms  = registerForm.getSMSNotification();
        log.info(name);
        log.info(password);
        log.info(facebook.toString());
        log.info(sms.toString());
        Notifier notifier = new MailNotification();
        if (facebook) {
            notifier = new FacebookNotification(notifier);
        }
        if (sms) {
            notifier = new SMSNotification(notifier);
        }
        notifier.send();
        return "index";
    }
}
