package com.example.heirsofabstractshape;

public class Square extends Rectangle {

    private double side;

    public Square(){}

    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        super.setLength(side);
        super.setWidth(side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side){
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square(side=" + side + ", color=" + super.getColor() +
                ", filled=" + super.isFilled() +')';
    }
}
