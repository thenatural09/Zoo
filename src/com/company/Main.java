package com.company;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        Eagle e = new Eagle();
        Snake s = new Snake();

        d.makeSound();
        e.makeSound();
        s.makeSound();

        System.out.println(d);
        System.out.println(e);
        System.out.println(s);
    }
}
