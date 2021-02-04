package com.company;


public class Main {

    public static void main(String[] args) {

        //Random opgave
        int Random_Integer = new Rand().RandomNumber(6,1);
        System.out.println(Random_Integer);
        System.out.println("-----------------------------------------------");


        // Kat Objekt
        Cat oscar = new Cat();
        oscar.name="Oscar";
        oscar.gender="male";
        oscar.age=3;
        oscar.weight=7;
        oscar.color="brown";
        oscar.texture="stribe";

        Cat luna = new Cat();
        luna.name="Luna";
        luna.gender="female";
        luna.age=2;
        luna.weight=5;
        luna.color="grey";
        luna.texture="plain";

        System.out.println(""+oscar);
        System.out.println(""+luna);
    }

}
