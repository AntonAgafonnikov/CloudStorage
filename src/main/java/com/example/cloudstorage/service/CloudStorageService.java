package com.example.cloudstorage.service;

import com.example.cloudstorage.repository.DataBaseRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CloudStorageService {

    private DataBaseRepository dataBaseRepository;

    public CloudStorageService(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }

    public String uploadFileToServer(String name, MultipartFile filename) {
        return dataBaseRepository.uploadFileToServer(name, filename);
    }
}
