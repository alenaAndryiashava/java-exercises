package com.company;

public class Average {
    int a;
    int b;
    int c;

    public Average(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double average(){
        return a*b*c/3;
    }

    @Override
    public String toString() {
        return "Average{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}'+" = "+average();
    }
}
