package com.company;


import java.awt.*;

public class ConcreteImageViewer implements ImageViewer {

    private String image = "Image in path ";

    public ConcreteImageViewer(String path) {
        // Costly operation
        this. image = this.image + path;
    }

    @Override
    public void displayImage() {
        // Costly operation
        System.out.println(image);
    }
}
