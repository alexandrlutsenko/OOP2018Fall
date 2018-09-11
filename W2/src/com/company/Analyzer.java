package com.company;

import java.util.Scanner;

public class Analyzer {
    public void run(){
        Scanner reader = new Scanner(System.in);
        Data cData = new Data();
        while (true){
            System.out.println("Enter number(Q to quit): ");
            String s = reader.nextLine();
            if (s.equals("Q") || s.equals("q")){
                System.out.println("Average = " + cData.getAvg());
                if (cData.getSize() > 0){
                    System.out.println("Maximum = " + cData.getMax());
                }
                System.out.print("\n");
                break;
            }else{
                cData.add(Double.parseDouble(s));
            }
        }
    }
}
