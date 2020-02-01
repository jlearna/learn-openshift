package com.learn.oc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearnOpenshiftApplication {

    public String welcome(){
        return "Hi Open Shift Works!";
    }

    public static void main(String[] args) {
        SpringApplication.run(LearnOpenshiftApplication.class, args);
    }

}
