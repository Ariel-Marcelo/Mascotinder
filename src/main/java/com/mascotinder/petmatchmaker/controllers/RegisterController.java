package com.mascotinder.petmatchmaker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @GetMapping("/registro")
    public String getFormRegister(){
        return "register";
    }
}
