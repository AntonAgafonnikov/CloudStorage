package com.example.cloudstorage.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Objects;

@Repository
public class DataBaseRepository {

    public String uploadFileToServer(String filename, MultipartFile file) {
        //TODO добавить запись в базу данных
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(Objects.requireNonNull(file.getOriginalFilename()))); //+ "-uploaded"
                stream.write(bytes);
                stream.close();
                return "Вы удачно загрузили " + filename + " в " + filename + "-uploaded !";
            } catch (Exception e) {
                return "Вам не удалось загрузить " + filename + " => " + e.getMessage();
            }
        } else {
            return "Вам не удалось загрузить " + filename + " потому что файл пустой.";
        }
    }
}
