package ZooOfInheritance;

public class TestDriveZoo {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.makeNoise();
        cat.roam();
        cat.sleep();

        Dog dog = new Dog();
        dog.makeNoise();

    }
}
