package com.example.kube_test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://front.devsj.site", maxAge = 3600)
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        System.out.println("요청이 들어왔습니다.");
        return "connect success!!";
    }
}
