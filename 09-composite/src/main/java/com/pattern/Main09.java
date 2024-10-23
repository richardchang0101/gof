package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main09 {
    public static void main(String[] args) {
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;
        folder1 = new Folder("sunny的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.jpg");
        file3 = new TextFile("九阴真经.txt");
        file4 = new TextFile("葵花宝典.jpg");
        file5 = new VideoFile("笑傲江湖.rmvb");

        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        folder3.add(file4);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(file5);
        folder1.killVirus();


    }
}