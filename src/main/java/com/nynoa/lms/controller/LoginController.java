package com.nynoa.lms.controller;

import com.nynoa.lms.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("")
    public String index() {
        return "account/login-index";
    }

    @PostMapping("/login")
    public String login(LoginDto loginDto) {
        System.out.println(loginDto.toString());
        System.out.println(loginDto.getUserType());
        return "redirect:/main";
    }
}
