package com.pattern;

/**
 * 界面皮肤工厂接口，充当抽象工厂
 */
public interface SkinFactory {
    //声明方法
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
