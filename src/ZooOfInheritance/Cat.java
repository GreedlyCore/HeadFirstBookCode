package ZooOfInheritance;

public class Cat extends Feline implements Pet,Garbage{


    @Override
    public void makeNoise() {
        System.out.println("cat is here meow!");
    }

    @Override
    public void eat() {

    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }
}
