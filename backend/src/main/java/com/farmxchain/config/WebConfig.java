package com.farmxchain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // match your backend API endpoints
                .allowedOrigins("http://localhost:3000") // frontend origin
                .allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
                .allowCredentials(true); // if sending cookies or auth headers
    }
}
