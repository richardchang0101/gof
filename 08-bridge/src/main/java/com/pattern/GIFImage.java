package com.pattern;

public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imp.doPrint(matrix);
        System.out.println(fileName+",格式为GIF");
    }
}
