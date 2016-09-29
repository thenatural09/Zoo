package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        Eagle e = new Eagle();
        Snake s = new Snake();

        d.makeSound();
        e.makeSound();
        s.makeSound();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an animal name");
        String name = scanner.nextLine();
        Animal a = createAnimal(name);
        System.out.println(a);

        //anonymous classes
        Mammal d2 = new Mammal() {
            @Override
            void makeSound() {
                System.out.println("Bark!");
            }
        };

        d2.makeSound();
    }

    //factory method
    static Animal createAnimal(String name) {
        Animal animal;
        if (name.equalsIgnoreCase("dog")) {
            animal = new Dog();
        }
        else if (name.equalsIgnoreCase("eagle")) {
            animal = new Eagle();
        }
        else if (name.equalsIgnoreCase("snake")) {
            animal = new Snake();
        }
        else {
            animal = new Animal();
        }
        return animal;
    }
}
