package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.print("Problem # 2\n");
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.ToString());

        System.out.print("Problem # 3\n");
        Analyzer analyzer = new Analyzer();
        analyzer.run();

        System.out.print("Problem # 5\n");
        int[] a = new int[5];
        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }
        DoubleIt di = new DoubleIt();
        int[] arr = di.Repeat(a);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
