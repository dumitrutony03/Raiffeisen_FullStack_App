package com.financial_platform.financial_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
//@RequestMapping("/api")
public class FinancialPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancialPlatformApplication.class, args);
    }
//    @GetMapping("/count-users")
//    public String getCountUsers(){
//        return "hello";
//    }
}
