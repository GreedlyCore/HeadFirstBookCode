package ZooOfInheritance;

//Кошачьи
public abstract class Feline extends Animal{
    @Override
    public void roam(){
        System.out.println("meow! i am roaming");
    }
    public void walking(){
        System.out.println("walking");
    }
}
