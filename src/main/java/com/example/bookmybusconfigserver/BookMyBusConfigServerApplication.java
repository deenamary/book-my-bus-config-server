package com.example.bookmybusconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BookMyBusConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookMyBusConfigServerApplication.class, args);
    }

}
