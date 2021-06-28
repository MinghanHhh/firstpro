package com.lmh.firstpro.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8081","null")
                .allowedMethods("GET","POST","PUT","HEAD","OPTIONS","DELETE")
                .allowCredentials(true)
                .maxAge(3600);


    }
}
