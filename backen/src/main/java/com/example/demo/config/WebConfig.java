package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        // THIS IS THE CRITICAL LINE:
                        // MUST be explicit origins, NOT "*" if allowCredentials is true
                        .allowedOrigins(
                                "http://localhost:4200",    // Angular dev server
                                "http://localhost:3000",    // React dev server (if needed)
                                "http://127.0.0.1:4200",   // Alternative localhost
                                "https://yourdomain.com"    // Production domain
                        ) // <-- Ensure this exactly matches your Angular dev server
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(false)
                        .maxAge(3600);
            }
        };
    }
}