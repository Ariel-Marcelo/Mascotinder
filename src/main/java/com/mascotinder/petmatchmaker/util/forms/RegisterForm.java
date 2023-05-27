package com.mascotinder.petmatchmaker.util.forms;

import lombok.Data;

@Data
public class RegisterForm {
    private String name;
    private String userName;
    private String password;
    private Boolean FacebookNotification;
    private Boolean SMSNotification;

}
