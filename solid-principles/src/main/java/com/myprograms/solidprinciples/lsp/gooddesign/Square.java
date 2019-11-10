package com.myprograms.solidprinciples.lsp.gooddesign;

public class Square extends Shape {

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return this.getSide() * this.getSide();
    }
}
