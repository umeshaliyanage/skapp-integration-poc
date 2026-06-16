package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync  // enables the @Async annotation for bulkSync
public class DirectorySyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(DirectorySyncApplication.class, args);
    }
}
