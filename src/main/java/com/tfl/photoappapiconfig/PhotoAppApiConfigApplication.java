package com.tfl.photoappapiconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PhotoAppApiConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppApiConfigApplication.class, args);
    }

}
