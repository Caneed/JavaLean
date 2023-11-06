package com.dedsec.Class;

public sealed class Animal permits Dog {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("I am running");
    }
}
