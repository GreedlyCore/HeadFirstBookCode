package ZooOfInheritance;

import java.util.ArrayList;

public class HowToPolymorphism {

    public static void main(String[] args) {

        Dog myDog = new Dog();
        Animal myDog2 = new Dog();
        // даже так... Ссылка более высокого уровня может ссылатсья на свой объект или по иерархии ниже
        //myDog2 = new Animal();
        // А зачем тип ссылки делать более общим?
        // А для полиморфных массивов?

        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();

        ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
        animalArrayList.add(new Dog());
        animalArrayList.add(new Cat());
        animalArrayList.add(new Wolf());
        animalArrayList.add(new Wolf());

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].roam();
        }

        System.out.println("------");

        PetOwner p = new PetOwner();
        p.start();



    }

}

class Calc{

    public  static int add(int a, int b){
        return a+b;
    }
    public  static double add(double a, double b){
        return a+b;
    }

}

class Vet{
    public void giveShot(Animal a){
        a.makeNoise();
    }
}

class PetOwner{
    public void start(){
        Vet v = new Vet();
        Dog d = new Dog();
        Hippo h = new Hippo();
        v.giveShot(d);
        v.giveShot(h);
    }
}