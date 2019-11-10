package com.myprograms.solidprinciples.lsp.baddesign;

public class Square extends Rectangle {
    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public int getArea() {
        return super.getArea();
    }
}
