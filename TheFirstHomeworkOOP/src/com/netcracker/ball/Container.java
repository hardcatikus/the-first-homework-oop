package com.netcracker.ball;

public class Container {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height){
        x1=x;
        y1=y;
        x2= x+width;
        y2= y+height;

    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2-x1;
    }

    public int getHeight() {
        return y2-y1;
    }

    public boolean collides(Ball ball){
        boolean isInsideBox = false;
        if(((ball.getX()-ball.getRadius()) >= x1) &&
                ((ball.getX()+ball.getRadius()) <= x2) &&
                ((ball.getY()-ball.getRadius()) >= y1) &&
                ((ball.getY()+ball.getRadius()) <= y2)){
            isInsideBox = true;
        }
        return isInsideBox;
    }

    @Override
    public String toString(){
        return "Container[(" + x1 +"," + y1 +
                "),(" + x2 + "," + y2 + ")]";
    }
}
