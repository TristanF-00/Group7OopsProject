package org.example.TristanFernandez;

public class ZooTester {
    public static void main(String[] args) {

        // an array of the different animals using constructors
        Animal[] animals = {
                new Lion(10,"Joseph", "male", 214.5),
                new Elephant(35, "Penelope", "Asian forest", 1.2),
                new Parrot(55, "Bertha", "grey"),
                new Eagle(12,"Ross", 12.5)
        };

        // iterating through the animals and calling all of the methods
        for (Animal animal : animals) {
            animal.sleep();
            animal.eat();
            animal.makeSound();
            // i misunderstood what was expected from the displayInformation method at first, and that is why there are random animal facts
            animal.displayInformation();
            System.out.println();
        }
    }
}
