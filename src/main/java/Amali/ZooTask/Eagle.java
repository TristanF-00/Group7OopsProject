package Amali.ZooTask;

public class Eagle extends Bird{
    Eagle(String name,int age,double weight){
        super(name,age,weight);
    }
    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is makeing Sound");
    }

    @Override
    void displayInformation() {
        System.out.println("Eagle info");
        System.out.println("name:" + this.name + " age:" + this.age);
    }
}
