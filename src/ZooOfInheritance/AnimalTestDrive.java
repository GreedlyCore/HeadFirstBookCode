package ZooOfInheritance;

import java.util.ArrayList;

public class AnimalTestDrive extends Object{
    public static void main(String[] args) {


        MyAnimalList list = new MyAnimalList();
        MyAnimalList list2 = new MyAnimalList();
        list.add(new Dog());
        list.add(new Dog());
        list.add(new Dog());
        list.add(new Hippo());
        list.add(new Hippo());
        list.add(new Hippo());
        list.add(new Hippo());
        System.out.println(list.getClass());
        System.out.println(new Cat().getClass());

        System.out.println(list.hashCode());
        System.out.println(list.equals(list2));
        System.out.println(list.equals(new Dog()));
        System.out.println(list.equals(list));


        ArrayList<Dog> dogs = new ArrayList<Dog>();
        Dog aDog = new Dog();
        dogs.add(aDog);

        ArrayList<Object> myDogList = new ArrayList<Object>();
        myDogList.add(aDog);

        //instance of образец, пример
        if (myDogList.get(0) instanceof Dog){
            System.out.println("This is object but he is dog!!");
        }

        Dog d = (Dog) myDogList.get(0); // Вернет Object type, высший в иерархии
        // Однако можно исправить с помощью приведения типов

    }
}
