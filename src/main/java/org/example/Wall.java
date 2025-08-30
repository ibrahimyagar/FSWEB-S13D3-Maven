package org.example;

public class Wall {

    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Getter metodları
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setter metodları
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Alan hesaplama
    public double getArea() {
        return width * height;
    }
}
