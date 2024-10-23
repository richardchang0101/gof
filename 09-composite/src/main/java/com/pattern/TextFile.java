package com.pattern;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.File;

public class TextFile extends AbstractFile {
    private String textName;

    public TextFile(String textName) {
        this.textName = textName;
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
        System.out.println("-----对文本文件进行杀毒-----：" + textName);
    }
}
