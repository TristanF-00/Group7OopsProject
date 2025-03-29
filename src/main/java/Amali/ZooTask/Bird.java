package Amali.ZooTask;

public class Bird extends Animal{
    protected String name;
    protected  int age;
    protected double weight;
    Bird (String name,int age,double weight){
        this.name = name;
        this.age = age;
        this.weight =weight;
    }
    @Override
    void displayInformation() {
        System.out.println("display bird info");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird making sound");
    }
}
