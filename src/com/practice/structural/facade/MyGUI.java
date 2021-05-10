package com.practice.structural.facade;

public class MyGUI {
    private GUIMenu menu;
    private GUIContent content;
    private GUITitleBar titlebar;

    public MyGUI() {
        menu = new GUIMenu();
        content = new GUIContent();
        titlebar = new GUITitleBar();
    }

    public void drawGUI() {
        content.showButtons();
        content.setDefaultValues();
        content.showTextFields();
        menu.drawGUIMenu();
        titlebar.showTitleBar();
    }
}
