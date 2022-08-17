package ZooOfInheritance;

public class Hippo extends Animal{

    public Hippo(String name){
        super(name);
    }

    public Hippo(){
        this("Test");
    }

    @Override
    public void makeNoise() {
        System.out.println("i am hippoooooooo! helllo");
    }

    @Override
    public void eat() {
        System.out.println("hippo is eating!");
    }
}
