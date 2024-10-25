package com.pattern;

public class EncryptFacade {

    private FileReader fileReader;
    private FileWriter fileWriter;
    private CliherMachine cliher;
    public EncryptFacade() {
        fileReader = new FileReader();
        fileWriter = new FileWriter();
        cliher = new CliherMachine();
    }
    public void encrypt(String text) {
        cliher.encrypt(text);
        fileWriter.fileWriter(text);
        fileReader.readFile(text);

    }
}
