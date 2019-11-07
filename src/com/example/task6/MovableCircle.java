package com.example.task6;

public class MovableCircle extends MovablePoint implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle(radius=" + radius + ", center=" + center + ')';
    }

    @Override
    public void moveUp() {
        super.moveUp();
        center.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
        center.moveRight();
    }
}
