package com.example.cloudstorage;

import com.example.cloudstorage.configuration.MultipartConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CloudStorageApplication {
    MultipartConfiguration multipartConfiguration;

    public CloudStorageApplication(MultipartConfiguration multipartConfiguration) {
        this.multipartConfiguration = multipartConfiguration;
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudStorageApplication.class, args);
    }

}
