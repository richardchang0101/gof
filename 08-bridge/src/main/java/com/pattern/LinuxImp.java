package com.pattern;

public class LinuxImp implements ImageImp {
    @Override
    public void doPrint(Matrix m) {
        System.out.println("在Linux绘制图像：");
    }
}
