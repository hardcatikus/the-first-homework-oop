package com.netcracker.mytriangle;

import com.netcracker.mypoint.MyPoint;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1,int y1,int x2,int y2, int x3, int y3) {
        this.v1.setXY(x1,y1);
        this.v2.setXY(x2,y2);
        this.v3.setXY(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString(){
        return "MyTriangle[v1=" + v1.toString() +
                ",v2=" + v2.toString() +
                ",v3=" + v3.toString() + "]";
    }

    public double getPerimeter(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType(){
        String type = "Scalene";
        double epsilon = 0.000001d;// ввод погрешности для сравнения двух переменных типа double
        if (Math.abs(v1.distance(v2) - v2.distance(v3)) < epsilon){
            if (Math.abs(v1.distance(v2) - v3.distance(v1)) < epsilon){
                type = "Equilateral";
            }
            else{
                type = "Isosceles";
            }
        }
        else if (Math.abs(v1.distance(v2) - v3.distance(v1)) < epsilon){
            type = "Isosceles";
        }
        else if (Math.abs(v2.distance(v3) - v3.distance(v1)) < epsilon){
            type = "Isosceles";
        }
        return type;
    }
}

