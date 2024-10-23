package com.pattern;

import java.io.File;

public class VideoFile extends AbstractFile {

    private String videoName;

    public VideoFile(String videoName) {
        this.videoName = videoName;
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
        System.out.println("-----对视频文件进行杀毒-----：" + videoName);
    }
}
