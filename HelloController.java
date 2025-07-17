   package com.example.demo;

   import org.springframework.web.bind.annotation.GetMapping;
   import org.springframework.web.bind.annotation.RestController;

   @RestController
   public class HelloController {
       
       @GetMapping("/hello")
       public String hello() {
           return "Spring Boot + Java 21 is running! 🚀";
       }
   }
   