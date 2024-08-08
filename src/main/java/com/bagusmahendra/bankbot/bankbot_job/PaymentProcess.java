package com.bagusmahendra.bankbot.bankbot_job;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PaymentProcess implements CommandLineRunner {@Override
    public void run(String... args) throws Exception {
        log.info("Im The king of the world!");
    }
    
}
