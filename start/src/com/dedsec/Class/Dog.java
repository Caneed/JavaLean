package com.dedsec.Class;

public non-sealed class Dog extends Animal {
    public String kind;

    public void hello() {
        System.out.println(super.name);
    }

    public Dog(String name, int age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    public Dog(){
        super();
    }

    @Override
    public void run() {
        System.out.println("dog is running");
    }
}
