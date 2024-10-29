package com.xworkz.prog;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PersonDetails {

    private String fileName;

    public PersonDetails(String fileName) {
        this.fileName = fileName;
    }

    public void openFile() {
        try {
            File file = new File(System.getProperty("user.home") + "/Downloads/" + fileName);
            if (file.exists()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.OPEN)) {
                    desktop.open(file);
                    System.out.println("File opened: " + file.getPath());
                } else {
                    System.out.println("Open action is not supported on this system.");
                }
            } else {
                System.out.println("File not found in Downloads.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
