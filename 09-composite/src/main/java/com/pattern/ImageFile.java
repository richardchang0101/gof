package com.pattern;

import java.io.File;

public class ImageFile extends AbstractFile {

    private String fileName;

    public ImageFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("sorry,不支持此种方法");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("sorry,不支持此种方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("sorry,不支持此种方法");
        return null;
    }

    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("-----对图像文件进行杀毒-----：" + fileName);
    }
}
