package com.pattern;

public class UnixImp implements ImageImp {
    @Override
    public void doPrint(Matrix m) {
        System.out.println("在Unix系统绘制图像：");
    }
}
