package Amali.ZooTask;

public class AnimalTester {
    public static void main(String[] args) {
        Lion lion = new Lion("Mike",20,45.55);
        lion.eat();
        lion.sleep();
        lion.makeSound();
        lion.displayInformation();

        Elephant elephant = new Elephant("Anik",15,100.45);
        elephant.eat();
        elephant.sleep();
        elephant.makeSound();
        elephant.displayInformation();

        Bird parrot = new Parrot("Jake",45,67.50);
        parrot.eat();
        parrot.sleep();
        parrot.makeSound();
        parrot.displayInformation();

        Bird eagle = new Eagle("Vini",18,5.80);
        eagle.eat();
        eagle.sleep();
        eagle.makeSound();
        eagle.displayInformation();

    }
}
