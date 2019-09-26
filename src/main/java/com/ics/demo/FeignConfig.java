package com.ics.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class FeignConfig {
    @Bean
    Logger.level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
