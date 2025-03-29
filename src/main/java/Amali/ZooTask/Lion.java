package Amali.ZooTask;

public class Lion extends Mammal{

    Lion(String name, int age, double weight){
        super(name,age, weight);

    }



    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion is makeing Sound");
    }

    @Override
    void displayInformation() {
        System.out.println("Lion Info");
        System.out.println("name:" + this.name + " age:" + this.age);
    }
}
