package com.arrieche.googleauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/signin")
    public String signin() {
        return "login"; // renderiza templates/login.html
    }
}
