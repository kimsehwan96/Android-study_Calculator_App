package com.example.calculator;

public class Calculator {
    protected StringBuilder stringBuffer;
    protected double numberBuffer;
    public int command;
    // 0 : no state
    // 1 : add
    // 2 : minus
    // 3 : mul
    // 4 : div
    // 5 : %
    // 6 :

    Calculator(){
        this.stringBuffer = new StringBuilder("");
        this.numberBuffer = 0;
        System.out.println("Cac made!");
        this.command = 0; // for find what command should do.
    }

    public void putStringBuffer(String text) {
        this.stringBuffer.append(text);
    }

    public void putNumberBuffer(){
        this.numberBuffer = Float.parseFloat(this.stringBuffer.toString());
        this.stringBuffer.setLength(0);
    } //문자열 값을 number버퍼에 입력하고, 문자열 버퍼를 초기화 한다. -> +, -, * , /, 버튼이 눌렸을 때 해당.
    //이때 +, -, *, / 의 명령어를 기억해서, = 버튼을 누르면 연산된 값을 numberbuffer에 저장후 출력한다.

    public void setCommand(int x){
        this.command = x;
    }

    public void resetCommand(){
        this.command = 0;
    }

    public int getCommand() {
        return this.command;
    }

    public double getNumberBuffer(){
        return this.numberBuffer;
    }

    public String getCalculateResult() {
        return String.valueOf(this.getNumberBuffer());
    }

    public String getStringBuffer(){
        return this.stringBuffer.toString();
    }

    public double getNumber(){
        return Float.parseFloat(this.stringBuffer.toString());
    }

    public void resetStringBuffer() {
        this.stringBuffer.setLength(0); // for reset buffer
    }


    public void resetBuffer() {
        System.out.println("Reset buffer !");
        this.numberBuffer = 0;
        this.stringBuffer.setLength(0);
        this.setCommand(0);
    }

    public void add(){
        this.numberBuffer += Float.parseFloat((this.stringBuffer.toString()));
        this.resetStringBuffer();
    }

    public void minus(){
        this.numberBuffer -= Float.parseFloat((this.stringBuffer.toString()));
        this.resetStringBuffer();
    }

    public void div(){
        this.numberBuffer /= Float.parseFloat((this.stringBuffer.toString()));
        this.resetStringBuffer();
    }

    public void mul(){
        this.numberBuffer *= Float.parseFloat((this.stringBuffer.toString()));
        this.resetStringBuffer();
    }

    public void calculate() {
        if (this.getStringBuffer() != ""){
            if (this.getCommand() == 1){
                this.add();
                this.resetCommand();
            }
            else if(this.getCommand() == 2) {
                this.minus();
                this.resetCommand();
            }
            else if(this.getCommand() == 3) {
                this.mul();
                this.resetCommand();
            }
            else if(this.getCommand() == 4) {
                this.div();
                this.resetCommand();
            }
            else {
                this.resetBuffer(); //unexpected operation
            }
            //after calculate we should reset command;
        }
        else {
            this.resetBuffer(); //unexpected doing.
        }
    }


}
