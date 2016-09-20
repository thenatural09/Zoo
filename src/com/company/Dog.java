package com.company;

/**
 * Created by Troy on 9/20/16.
 */
public class Dog extends Mammal {
    Dog () {
        this.name = "Dog";
    }

    @Override //so that it won't go up the ladder to look for makeSound
    void makeSound() {
        System.out.println("Bark");
    }
}
