package com.company;

public class Data {
    private double Avg;
    private double Max;
    private int Size;
    Data(){
        Avg = 0;
        Size = 0;
    }
    public void add(double a){
        if ((Size == 0) || (a > Max)) {
            Max = a;
        }
        Avg = (Avg * Size + a) / ++Size;
    }

    public double getAvg(){
        return Avg;
    }
    public double getMax(){
        return Max;
    }
    public int getSize(){
        return Size;
    }
}
