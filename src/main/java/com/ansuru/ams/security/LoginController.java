package com.ansuru.ams.security;

import com.ansuru.ams.security.dto.LoginRequest;
import com.ansuru.ams.security.dto.LoginResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("login")
    public LoginResponse login(LoginRequest loginRequest){
        System.out.println(123123);
        return new LoginResponse();
    }
}
