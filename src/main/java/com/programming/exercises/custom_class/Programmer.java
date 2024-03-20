package com.programming.exercises.custom_class;

import java.util.*;

class Programmer {

    private int age;
    private String name;

    Programmer() {

    }

    Programmer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    public void codes() {
        System.out.println(this.name + " writes codes");
    }

    public void drinksCoffee() {
        System.out.println(this.name + " drinks coffee and can then convert exponential complexity codes to polynomial");
    }
}

class Main {
    public static void main(String args[]) {
        // Your code goes here
        Programmer p1 = new Programmer(22, "Guneet");
        p1.codes();
        p1.drinksCoffee();
    }
}