package Amali.ZooTask;

public class Mammal extends Animal{
    protected String name;
    protected int age;
    protected double weight;

    Mammal(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    void displayInformation() {
        System.out.println("display Mammal info");
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Mammal is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal making sound");
    }
}
