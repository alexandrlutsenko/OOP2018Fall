package com.company;

public class StarTriangle {
    private int Size;
    StarTriangle (int a){
        Size = a;
    }
    public String ToString(){
        String s = new String();
        for (int i = 1; i <= Size; i++){
            for (int j = 1; j <= i; j++){
                s += "[*]";
            }
            s += "\n";
        }
        return s;
    }
}
