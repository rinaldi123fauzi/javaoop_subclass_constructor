package com.tutorial;

// //subclass
// class HeroStreght extends Hero {

//     //constructor
//     HeroStreght(String name, double defencePower){
//         super(name, defencePower);
//     }

//     //overloading constructor(constructor nya sama dengan yang diatas)
//     HeroStreght(String name){
//         super(name);
//     }
// }

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Saitama", 10);
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Ucup", 10);
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Otong");
        hero3.display();
    }
}