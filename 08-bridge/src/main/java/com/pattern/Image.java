package com.pattern;

public abstract class Image {
    protected  ImageImp imp ;
    //注入实现类接口对象

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }
    public abstract void parseFile(String fileName);
}
