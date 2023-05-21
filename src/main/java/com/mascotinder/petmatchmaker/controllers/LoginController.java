    package com.mascotinder.petmatchmaker.controllers;

    import lombok.extern.slf4j.Slf4j;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    @Controller
    @Slf4j
    public class LoginController {

        @GetMapping("/")
        public String login(Model model){
            log.info("Hello");
            return "index";
        }

    }
