package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.annotation.PostConstruct;

@Configuration
public class ThymeleafExtension {
    @Autowired
    private SpringTemplateEngine templateEngine;

    @PostConstruct
    public void extension() {

    }
}
