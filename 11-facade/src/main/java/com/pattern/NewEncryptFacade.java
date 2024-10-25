package com.pattern;

public class NewEncryptFacade extends AbstractEncryptFacade{

    //通过继承抽象类的形式 继承了新的子系统，没有改变旧的外观 这样的话讲新的外观类通过配置文件反射的形式就可以实现新的功能，符合了开闭原则
    private FileReader fileReader;
    private FileWriter fileWriter;
    private NewEncryptFacade newEncryptFacade;
    public NewEncryptFacade() {
        fileReader = new FileReader();
        fileWriter = new FileWriter();
        newEncryptFacade = new NewEncryptFacade();
    }

    @Override
    public void encrypt(String plainText) {
        fileReader.readFile(plainText);
        newEncryptFacade.encrypt(plainText);
        fileWriter.fileWriter(plainText);
    }
}
