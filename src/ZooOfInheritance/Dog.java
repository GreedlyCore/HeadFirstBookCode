package ZooOfInheritance;

public class Dog extends Canine implements Pet{

    @Override
    public void makeNoise() {
        super.makeNoise(); // выполняет родительский метод makeNoise();
        System.out.println("doggie!");
    }

    @Override
    public void eat() {
        System.out.println("doggie is eating!");
    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }
}
