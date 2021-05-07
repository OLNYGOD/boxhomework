package com.Box;

public class Boxgeenerate {
    String name;
    float length;
    float width;
    int height;

    public Boxgeenerate(String name, float length, float width, int height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, int height) {
        return (length <= this.length && width <= this.width && height <= this.height);
    }
}
