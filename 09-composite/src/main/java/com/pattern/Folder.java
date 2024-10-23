package com.pattern;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    //文件夹类 充当容器构建类

    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    private String folderName;

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public void add(AbstractFile file) {
        list.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        list.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return list.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹进行杀毒" + folderName);
        for (AbstractFile abstractFile : list) {
            abstractFile.killVirus();
        }
    }
}
