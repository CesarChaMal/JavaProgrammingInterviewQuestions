package com.programming.exercises.diamond_problem;

class A {
    public void print() {
        System.out.println("Class A print method");
    }
}

class B extends A {
    @Override
    public void print() {
        System.out.println("Class B print method");
    }
}

class C extends A {
    @Override
    public void print() {
        System.out.println("Class C print method");
    }
}

//multiple inheritance not allowed in Java
//class D extends A, B {
class D extends A {
    @Override
    public void print() {
        System.out.println("Class D print method");
    }
}

class Main {

    public static void main(String args[]) {
        // Your code goes here
        D obj = new D();
        obj.print();
    }
}