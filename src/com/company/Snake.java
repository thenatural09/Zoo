package com.company;

/**
 * Created by Troy on 9/20/16.
 */
public class Snake extends Reptile {
    Snake () {
        this.name = "Snake";
    }

    @Override
    void makeSound() {
        System.out.println("Hiss");
    }
}
