package com.abhay;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    public String sayHello(){
        return "second example related to docker jenkins integration";
    }

    public String greetings(){
        return "greeting fromgi docker jenkins integration";
    }

}
