package com.programming.exercises.nesting_of_classes;

public class Main {

    public static void main(String[] args) {
        Outer obj1 = new Outer(10, 20);

        Outer.Inner2 obj2 = new Outer.Inner2(40);
        obj2.showData();

        Outer.Inner3.z = 100;
        System.out.println(Outer.Inner3.z);
    }

}

class Outer {

    private int x, y;

    Outer() {
        System.out.println("Outer class default constructor called");
    }

    Outer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void showData() {
        System.out.println("the value of x is:" + x + " and the value of y is: " + y);
    }

    class Inner1 {

        int z = 0;

        Inner1() {
            System.out.println("Inner class default constructor called");
        }

        Inner1(int z) {
            this.z = z;
        }

        void showData() {
            System.out.println("The value of x is: " + x + " the value of y is: " + y + " and z is: " + z);
        }
    }

    static class Inner2 {

        int z = 0;

        Inner2() {
            System.out.println("Inner class default constructor called");
        }

        Inner2(int z) {
            this.z = z;
        }

        void showData() {
            System.out.println("The value of z is: " + z);
        }
    }

    static class Inner3 {

        static int z = 0;

        Inner3() {
            System.out.println("Inner class default constructor called");
        }

        Inner3(int a) {
            z = a;
        }

        void showData() {
            System.out.println("The value of z is: " + z);
        }
    }
} 