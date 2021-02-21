package com.company;

public class Main {

    public static void main(String[] args) {

        // Proxy
        ImageViewer flowers = new ConcreteImageViewer("./photos/flowers.png");
        ImageViewer trees = new ConcreteImageViewer("./photos/trees.png");
        ImageViewer grass = new ConcreteImageViewer("./photos/grass.png");

        ImageViewer sky = new ImageViewerProxy("./photos/sky.png");
        ImageViewer sun = new ImageViewerProxy("./photos/sun.png");
        ImageViewer clouds = new ImageViewerProxy("./photos/clouds.png");

        sky.displayImage();

        // Facade
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
