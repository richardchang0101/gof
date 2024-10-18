package com.pattern;

public class Attachment {
    //附件名称
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void download(){
        System.out.println("Downloading " + fileName);
    }
}
