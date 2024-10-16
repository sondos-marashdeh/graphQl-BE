package com.example.GraphQl;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Apply to all endpoints
                .allowedOrigins("http://localhost:4200")  // Frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Allowed methods
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true)  // Allow credentials like cookies
                .maxAge(3600);  // Cache the response for 1 hour
    }
}
