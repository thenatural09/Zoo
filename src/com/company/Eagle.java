package com.company;

/**
 * Created by Troy on 9/20/16.
 */
public class Eagle extends Bird{
    Eagle () {
        this.name = "Eagle";
    }

    @Override
    void makeSound() {
        System.out.println("Caw");
    }
}
