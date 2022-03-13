package com.company;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int a,int b){
        this.length = a;
        this.breadth = b;
    }
    public int getPerimeterOfRectangle(){
        return 2*length+2*breadth;
    }
    public int getAreaOfRectangle(){
        return length*breadth;
    }

}
