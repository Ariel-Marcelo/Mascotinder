package com.mascotinder.petmatchmaker.util.forms;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class LoginForm {

    private String userName;
    private String password;


}
