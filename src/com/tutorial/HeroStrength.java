package com.tutorial;

//subclass
public class HeroStrength extends Hero {

    //constructor
    HeroStrength(String name, double defencePower){
        super(name, defencePower);
    }

    //overloading constructor(constructor nya sama dengan yang diatas)
    HeroStrength(String name){
        super(name);
    }
}
