package com.example.blog.controller.account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    private  String port;

    @RequestMapping("/hi")
    public String home() {
        return "hi, client, i'm from " + port;
    }

}
