package com.company;

import java.util.Arrays;

public class Point {
    float x;
    float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY() {
        this.x = x;
        this.y = y;
    }

    public String getXY() {
        float[] arr = {x, y};
        return Arrays.toString(arr);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ",arr= " + this.getXY() +
                '}';
}
}
