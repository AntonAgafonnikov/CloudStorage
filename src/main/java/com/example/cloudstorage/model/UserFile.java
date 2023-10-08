package com.example.cloudstorage.model;

import java.io.File;

public class UserFile {
    private String hash;
    private File file;

    public UserFile() {
    }

    public UserFile(String hash, File file) {
        this.hash = hash;
        this.file = file;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
