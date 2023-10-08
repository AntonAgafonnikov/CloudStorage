package com.example.cloudstorage.controller;

import com.example.cloudstorage.model.User;
import com.example.cloudstorage.model.UserFile;
import com.example.cloudstorage.service.CloudStorageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.ws.rs.QueryParam;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@RestController
public class HttpPathController {

    public CloudStorageService cloudStorageService;

    public HttpPathController(CloudStorageService cloudStorageService) {
        this.cloudStorageService = cloudStorageService;
    }

    @GetMapping("/home")
    public String welcomeHome() {
        return "Welcome!";
    }

    @PostMapping("/login")
    public String entryUser(@RequestBody User user) {
        return user.getLogin() + user.getPassword() + "23432rfdsf32fsdfsedf32rf";
    }

    @PostMapping("/logout")
    public String exitUser(@RequestHeader("auth-token") String authToken) {
        return "Переход на страницу ввода логина и пароля" + authToken;
    }

//    @PostMapping("/file")
//    public @ResponseBody String uploadFileToServer(@RequestHeader("auth-token") String authToken,
//                                     @RequestParam("filename") String fileName,
//                                     @RequestBody UserFile userFile){
//        return "Success upload. auth-token = " + authToken + ". filename = " + fileName +
//                ". The File name = " + userFile.getFile().getName() + ". Hash = " + userFile.getHash();
//    }

    @PostMapping("/file{filename}")
    public @ResponseBody String uploadFileToServer(@RequestHeader("auth-token") String authToken,
                                                   @PathVariable("filename") String filename,
                                                   @RequestParam("file") MultipartFile file){
        return cloudStorageService.uploadFileToServer(filename, file);
    }



    @DeleteMapping("/file")
    public String deleteFileFromServer(@RequestHeader("auth-token") String authToken,
                                       @RequestParam("filename") String fileName){
        return "Success deleted";
    }


//    @GetMapping("/file")
//    public File downloadFileFromCloud(@RequestHeader("auth-token") String authToken,
//                                     @RequestParam("filename") String fileName
//                                     @RequestBody ){
//        return "File is gat. authToken = " + authToken + " . fileName = " + fileName;
//    }


    @PutMapping("/file")
    public String editFileName(@RequestHeader("auth-token") String authToken,
                               @RequestParam("filename") String fileName){
        return "Success upload";
    }






//    //TODO Возможно перенести в другой контролле с применением ТУТ RequestMapping("/file")
//    @GetMapping("/list")



}
