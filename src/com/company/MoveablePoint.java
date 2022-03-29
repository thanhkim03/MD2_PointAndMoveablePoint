package com.company;

import java.util.Arrays;

public class MoveablePoint extends Point{
    public float xSpeed =0.0f;
    public float ySpeed =0.0f;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public MoveablePoint move(){
        x += xSpeed;
        y+= ySpeed;
        return this;
    }

    public String getSpeed() {
        float[] array = {xSpeed, ySpeed};
        return Arrays.toString(array);
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", arr =" + this.getSpeed() +
                '}';
    }
}
