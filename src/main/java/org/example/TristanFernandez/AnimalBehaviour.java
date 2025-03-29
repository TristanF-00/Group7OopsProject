package org.example.TristanFernandez;

public interface AnimalBehaviour {
    // interface for animal behaviours inherited by all animals
    void eat();

    void sleep();

    void makeSound();

}

abstract class Animal implements AnimalBehaviour {
    // abstract animal class implementing animal behaviours
    @Override
    public void sleep() {
        System.out.println("Animal sleeps during the night.");
    }

    public abstract void displayInformation();

}

class Mammal extends Animal {
    // class for mammals, extending animal class and overriding some methods from interface
    @Override
    public void eat() {
        System.out.println("Mammals need to eat food.");
    }

    @Override
    public void makeSound() {
        System.out.println("Mammals often make sounds whether that be a bark or speaking English.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Information for Mammals:");
        System.out.println("\tMost Mammals give birth to live babies");
        System.out.println("\tAll mammals have warm blood.");
        System.out.println("\tMammals have backbones.");
    }
}

class Bird extends Animal {
    // bird class extending animal class and overriding some methods from interface
    @Override
    public void eat() {
        System.out.println("Birds eat food.");
    }

    @Override
    public void makeSound() {
        System.out.println("Birds also make sounds. Some tweet while others caw.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Information for Birds:");
        System.out.println("\tThere are over 18,000 species of birds worldwide.");
        System.out.println("\tBirds are covered in feathers and come in remarkable colours.");
        System.out.println("\tBirds have hollow bones, which allow them to fly.");
        System.out.println("\tApproximately 2/3 of all bird species are found in tropical rain forests.");
    }
}
// class for lion extending mammal and with a constructor and overriding all super methods
class Lion extends Mammal {
    private int age;
    private String name;
    private String sex;
    private double weight;

    public Lion(int age, String name, String sex, double weight) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.weight = weight;
    }

    @Override
    public void sleep() {
        System.out.println("If prey is abundant, both sexes typically spend 21 to 22 hours a day resting, sleeping, or sitting and hunt for only 2 to 3 hours a day.");
    }

    @Override
    public void eat() {
        System.out.println("Lions typically gorge themselves and then rest for several days in its vicinity.");
        System.out.println("An adult male can consume more than 34kg(75lbs) of meat at a single meal and rest for a week before resuming the hunt.");
    }

    @Override
    public void makeSound() {
        System.out.println("Lions proclaim their territory by roaring.");
        System.out.println("Their distinctive roar is generally delivered in the evening before a night's hunting and again before getting up at dawn.");
    }

    @Override
    public void displayInformation() {
        System.out.println(name + " is a " + sex + " lion of " + age + " years old and weighing " + weight + "lbs.");
        System.out.println("Information for Lions:");
        System.out.println("\tthe lion is a well muscled cat with a long body, large head, and short legs.");
        System.out.println("\tthe males outstanding characteristic is his mane.");
        System.out.println("\ta full grown male is about 1.8-2.1 metres (6-7 feet) long, and weighs 170-120kg (370-500lbs)");
        System.out.println("\ta lioness is smaller, body length of 1.5 metres and weight of 120-180kg");
    }
}
// class for elephant extending mammal with a constructor and overriding all super methods
class Elephant extends Mammal {
    private int age;
    private String name;
    private String species;
    private double trunkLength;

    public Elephant(int age, String name, String species, double trunkLength) {
        this.age = age;
        this.name = name;
        this.species = species;
        this.trunkLength = trunkLength;
    }

    @Override
    public void sleep() {
        System.out.println("Elephants typically only sleep for two hours a day.");
        System.out.println("They often take short naps throughout the day and night.");
    }

    @Override
    public void eat() {
        System.out.println("Elephants are herbivores");
    }

    @Override
    public void makeSound() {
        System.out.println("If threatened, an elephant will use its trunk to make loud trumpeting noises as a warning.");
    }

    @Override
    public void displayInformation() {
        System.out.println(name + " is an " + species + " elephant of " + age + " years old and a trunk measuring " + trunkLength + " metres.");
        System.out.println("Information for Elephants:");
        System.out.println("\tmale african elephants can reach 3 metres tall and weigh between 4,000 to 7,000kg");
        System.out.println("\telephants are the largest land mammals");
        System.out.println("\tthere are 3 different species of elephants , African Savannah, African Forest, and Asian Forest");
        System.out.println("\tthey have the longest gestation period of any animal in the world, taking 22 months from conception");
    }
}
// class for parrot extending bird and with a constructor and overriding all super methods
class Parrot extends Bird {
    private int age;
    private String name;
    private String colour;

    public Parrot(int age, String name, String colour) {
        this.age = age;
        this.name = name;
        this.colour = colour;
    }

    @Override
    public void sleep() {
        System.out.println("There are some parrots that sleep hanging upside down like bats");
    }

    @Override
    public void eat() {
        System.out.println("Parrots are omnivores, they eat fruits but also some bugs.");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrots are famous for being able to imitate human language.");
    }

    @Override
    public void displayInformation() {
        System.out.println(name + " is a parrot of " + age + " years old and predominately coloured " + colour + ".");
        System.out.println("Information for Parrots:");
        System.out.println("\tparrots are zygodactyl which means they have a 2 by 2 configuration of their toes for optimum grip");
        System.out.println("\tthey only have 300 tastebuds");
        System.out.println("\tthere are some parrots that cannot fly");
    }
}
// eagle class extending bird and with a constructor and overriding all super methods
class Eagle extends Bird {
    private int age;
    private String name;
    private double weight;

    public Eagle(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void sleep() {
        System.out.println("Eagles are known to take short naps throughout the day and night");
    }

    @Override
    public void eat() {
        System.out.println("Eagles are strictly carnivorous, primarily feeding on fish, small mammals, and other birds");
    }

    @Override
    public void makeSound() {
        System.out.println("The sound used for eagles in movies is not an eagle but a Red-tailed Hawk.");
    }

    @Override
    public void displayInformation() {
        System.out.println(name + " is an eagle of " + age + " years old, and weighing " + weight + "lbs.");
        System.out.println("Information for Eagles:");
        System.out.println("\tan eagles eyesight is around 5 times better than human vision");
        System.out.println("\tin ancient greek mythology, the eagle is considered the patron animal of Zeus");
        System.out.println("\tfor centuries, eagles have been revered as symbols of power and freedom");
        System.out.println("\teagles live for 20-30 years in the wild");
    }
}