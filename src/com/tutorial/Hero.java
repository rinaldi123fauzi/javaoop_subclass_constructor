package com.tutorial;

public class Hero {
    //attribute
    String name;
    double defencePower;

    //constructor
    Hero(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    //overloading constructor(constructor nya sama dengan yang diatas)
    Hero(String name){
        this.name = name;
    }

    void display(){
        System.out.println("Hero : " + this.name);
    }
}