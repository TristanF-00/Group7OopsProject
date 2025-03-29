package Amali.ZooTask;

public class Parrot extends Bird{
    Parrot (String name,int age,double weight){
        super(name,age,weight);
    }
    
    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot is makeing Sound");
    }

    @Override
    void displayInformation() {
        System.out.println("Parrot info");
        System.out.println("name:" + this.name + " age:" + this.age);
    }
}
