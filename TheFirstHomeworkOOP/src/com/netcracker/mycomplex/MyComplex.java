package com.netcracker.mycomplex;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real,double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString(){
        return "(" + real + "+" + imag +"i)";
    }

    public boolean isReal(){
        boolean isReal = true;
        if(real == 0.0){
            return false;
        }
        return  isReal;
    }

    public boolean isImaginary(){
        boolean isImaginary = true;
        if(imag == 0.0){
            return false;
        }
        return  isImaginary;
    }

    public boolean equals(double real, double imag){
        boolean equals = false;
        double epsilon = 0.000001d;// ввод погрешности для сравнения двух переменных типа double
        if ((Math.abs(this.real - real) < epsilon)&&(Math.abs(this.imag - imag) < epsilon)){
            equals = true;
        }
        return equals;
    }

    public boolean equals(MyComplex another){
        boolean equals = false;
        double epsilon = 0.000001d;
        if ((Math.abs(real - another.real) < epsilon) && (Math.abs(imag - another.imag) < epsilon)){
            equals = true;
        }
        return equals;
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
    }

    public double argument(){
        return Math.atan2(imag,real);
    }

    public MyComplex add(MyComplex right){
        real += right.real;
        imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(real + right.real,imag + right.imag);
    }

    public MyComplex subtract(MyComplex right){
        real -= right.real;
        imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return  new MyComplex(real - right.real,imag - right.imag);
    }

    public MyComplex multiply(MyComplex right){
        real = real * right.real - imag * right.imag;
        imag = real * right.imag + imag * right.real;
        return this;//(a+bi)(c+di)=(ac-bd)+(ad+bc)i
    }

    public MyComplex divide(MyComplex right){
        real = (real * right.real + imag * right.imag)/(Math.pow(right.real,2)+Math.pow(right.imag,2));
        imag = (imag * right.real - real * right.imag)/(Math.pow(right.real,2)+Math.pow(right.imag,2));
        return this;//(a+bi)/(c+di)=(ac+bd)/(cc+dd) + ((cb-ad)/(cc+dd))i
    }

    public MyComplex conjugate(){
        return new MyComplex(real,-imag);//a+bi -> a-bi
    }
}
