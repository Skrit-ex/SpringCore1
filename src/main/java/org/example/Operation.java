package org.example;

public class Operation {
    private double num1;
    private double num2;
    private double result;
    private String type;


    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        return result;
    }

    public String getType() {
        return type;
    }

    public Operation setResult(double result) {
        this.result = result;
        return this;
    }
}
