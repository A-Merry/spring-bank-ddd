package com.harry.ddd.bank.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author harry.peng 2021/1/27
 */
@SpringBootApplication(scanBasePackages = "com.harry.ddd.bank")
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
