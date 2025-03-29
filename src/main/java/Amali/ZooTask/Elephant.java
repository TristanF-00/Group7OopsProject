package Amali.ZooTask;

public class Elephant extends Mammal{

    Elephant(String name, int age, double weight){
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is makeing Sound");
    }

    @Override
    void displayInformation() {
        System.out.println("Elephant info");
        System.out.println("name:" + this.name + " age:" + this.age);
    }
}
