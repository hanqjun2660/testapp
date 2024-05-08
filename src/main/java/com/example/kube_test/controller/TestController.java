package com.example.kube_test.controller;

import com.example.kube_test.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Response test() {
        System.out.println("요청이 들어왔습니다.");
        return new Response("connect success!!");
    }
}
