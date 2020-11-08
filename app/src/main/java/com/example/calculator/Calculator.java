package com.example.calculator;

public class Calculator {
    protected StringBuilder stringBuffer;
    protected double numberBuffer;

    Calculator(){
        this.stringBuffer = new StringBuilder("");
        this.numberBuffer = 0;
        System.out.println("Cac made!");
    }

    public void putStringBuffer(String text) {
        this.stringBuffer.append(text);
    }

    private void putNumberBuffer(){
        this.numberBuffer = Float.parseFloat(this.stringBuffer.toString());
        this.stringBuffer.setLength(0);

    }

    public void resetStringBuffer() {
        this.stringBuffer.setLength(0); // for reset buffer
    }

    public void calculatingCallBack(String command) {
        if (command.equals("add")) {
        }
    }

    private void resetBuffer() {
        System.out.println("Reset buffer !");
        this.numberBuffer = 0;
        this.stringBuffer.setLength(0);
    }

    public double add(double x, double y){
        System.out.println("x + y " + (x+y));
        return x + y;
    }

    public double minus(double x, double y){
        System.out.println("x - y" + (x-y));
        return x - y;
    }



}
