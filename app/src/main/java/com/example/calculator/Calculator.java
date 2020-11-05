package com.example.calculator;

public class Calculator {
    protected double buffer;

    Calculator(){
        this.buffer = 0;
        System.out.println("Cac made!");
    }

    private void resetBuffer() {
        System.out.println("Reset buffer !");
        this.buffer = 0;
    }

    public double add(double x, double y){
        System.out.println("x + y " + (x+y));
        return x + y;
    }

    public double minus(double x, double y){
        System.out.println("x - y" + (x-y));
        return x - y;
    }

    public void reset(){
        this.resetBuffer();
    }


}
