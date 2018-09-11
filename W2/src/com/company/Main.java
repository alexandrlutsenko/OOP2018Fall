package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.print("Problem # 1\n");
        Student student = new Student("Studento", "17BD000000");
        String d = student.get_data();
        System.out.println(d);
        student.incYear();
        String d1 = student.get_data();
        System.out.println(d1);

        System.out.print("Problem # 2\n");
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.ToString());

        System.out.print("Problem # 3\n");
        Analyzer analyzer = new Analyzer();
        analyzer.run();

        System.out.print("Problem # 4\n");
        Time t=new Time(23,5,6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2=new Time(4,24,33);
        System.out.println(t.add(t2));

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
