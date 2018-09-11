package com.company;

public class DoubleIt {
    public int[] Repeat (int[] a){
        int[] arr = new int[a.length * 2];
        for (int i = 0; i < a.length; i++){
            arr[i * 2] = a[i];
            arr[i * 2 + 1] = a[i];
        }
        return arr;
    }
}
