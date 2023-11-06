package com.dedsec.Cls;

public class Dog {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Woof");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("puppy", 3);
    }
}
