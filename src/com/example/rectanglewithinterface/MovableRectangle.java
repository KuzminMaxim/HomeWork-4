package com.example.rectanglewithinterface;

public class MovableRectangle extends MovablePoint implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        super(x1,y1,xSpeed,ySpeed);
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle(" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + ')';
    }

    @Override
    public void moveUp() {
        super.moveUp();
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
