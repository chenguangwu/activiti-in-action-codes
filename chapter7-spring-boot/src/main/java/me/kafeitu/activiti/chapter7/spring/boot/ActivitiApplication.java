package me.kafeitu.activiti.chapter7.spring.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: 陈光武
 * @Date: Created in 2019/1/23 15:56
 */
@ServletComponentScan
@SpringBootApplication
@ComponentScan(basePackages = {"me.**"})
public class ActivitiApplication implements CommandLineRunner {
    public ActivitiApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(ActivitiApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {
    }
}
