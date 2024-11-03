package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main16 {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20";
        InstructionHandler ih = new InstructionHandler();
        ih.handle(instruction);
        String output = ih.output();
        System.out.println(output);
    }
}