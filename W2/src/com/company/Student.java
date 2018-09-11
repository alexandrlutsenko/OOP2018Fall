package com.company;

public class Student{
    String name ;
    String id ;
    int year = 0;

    Student(String name, String id ){
        this.name = name;
        this.id = id;
    }

    String get_data(){
        return name + " " + id + " " + year;
    }

    public void incYear(){
        year++;
    }
}