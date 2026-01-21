package main;

import domain.Animal;
import domain.Dog;
import domain.Pig;

public class Main {
    static void main(String[] args) {
        Animal a = new Animal();
        a.animalSound();
        Dog d = new Dog();
        d.animalSound();
        Pig p = new Pig();
        p.animalSound();
    }
}
