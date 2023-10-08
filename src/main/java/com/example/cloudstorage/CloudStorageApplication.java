package com.example.cloudstorage;

import com.example.cloudstorage.configuration.MultipartConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CloudStorageApplication {

    @Autowired
    MultipartConfiguration multipartConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(CloudStorageApplication.class, args);
    }

}
