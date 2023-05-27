    package com.mascotinder.petmatchmaker.controllers;

    import com.mascotinder.petmatchmaker.util.forms.LoginForm;
    import com.mascotinder.petmatchmaker.util.notification.*;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.ModelAttribute;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RestController;

    @Controller
    @Slf4j
    public class LoginController {

        @GetMapping("/")
        public String login(){
            log.info("Hello");
            return "index";
        }

        @PostMapping("/login")
        public String login(@ModelAttribute("loginForm") LoginForm loginForm){
            String name = loginForm.getUserName();
            String password = loginForm.getPassword();
            return "home";
        }

    }
