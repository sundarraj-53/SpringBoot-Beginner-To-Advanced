package com.SpringBoot.GetSpringBoot.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//Combines of @Controller --> For Spring MVC
// and @ResponseBody -->Convert java to  Json to the client

@RestController
public class HelloWorldController {

    //http://localhost:8080/getMessage

    @GetMapping("/get-message")
    public String helloWorld() {
        return "Hi, I am Sundarraj, an aspiring Spring Boot learner passionate about building robust and scalable applications. I have a strong foundation in Java and have begun my journey into the Spring Boot ecosystem. With a keen interest in backend development, I am constantly expanding my skills and exploring new technologies to build a successful career in software development.";
    }

}
