package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

interface GoogleSearch {
    String buildUrl(String q);
}

@Configuration
public class ThymeleafConfig {
    @Bean(name = "googleSearch")
    public GoogleSearch googleSearch() {
        return (q) -> "https://google.com/search?q=" + q;
    }
}
